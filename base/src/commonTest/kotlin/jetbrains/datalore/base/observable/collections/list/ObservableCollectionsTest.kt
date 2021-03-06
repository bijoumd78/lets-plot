/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.base.observable.collections.list

import jetbrains.datalore.base.function.Predicate
import jetbrains.datalore.base.function.Supplier
import jetbrains.datalore.base.function.Value
import jetbrains.datalore.base.observable.collections.CollectionItemEvent
import jetbrains.datalore.base.observable.collections.list.ObservableCollections.toObservable
import jetbrains.datalore.base.observable.event.EventHandler
import jetbrains.datalore.base.observable.property.PropertyChangeEvent
import jetbrains.datalore.base.observable.property.ValueProperty
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ObservableCollectionsTest {
    companion object {
        private val STARTS_WITH_A: Predicate<String?> = { value -> value?.startsWith("a") ?: false }
    }

    @Test
    fun testReadingHandlerOnSelectList() {
        val property = ValueProperty<List<String>?>(null)
        val collection = ObservableCollections.selectList<List<String>?, String>(property) { value -> toObservable(value!!) }

        val emptyEventHandler = object : EventHandler<CollectionItemEvent<out String?>> {
            override fun onEvent(event: CollectionItemEvent<out String?>) {
            }

        }
        val registration = collection.addHandler(emptyEventHandler)
        property.set(listOf("1", "2"))
        registration.dispose()

        collection.addHandler(emptyEventHandler)
        val expected: List<String?> = property.get()!!
        assertEquals(expected, collection as List<String?>)
    }

    @Test
    fun count() {
        val collection = ObservableArrayList<String>()
        val count = ObservableCollections.count(collection, STARTS_WITH_A)

        runChanges(collection, count)
    }

    @Test
    fun countListener() {
        val collection = ObservableArrayList<String>()
        val count = ObservableCollections.count(collection, STARTS_WITH_A)

        val lastUpdate: Value<Int> = Value(0)
        count.addHandler(object : EventHandler<PropertyChangeEvent<out Int>> {
            override fun onEvent(event: PropertyChangeEvent<out Int>) {
                lastUpdate.set(event.newValue!!)
            }
        })

        runChanges(collection, lastUpdate)
    }

    @Test
    fun allTest() {
        val collection = ObservableArrayList<String>()
        val all = ObservableCollections.all(collection, STARTS_WITH_A)

        assertTrue(all.get()!!)

        collection.add("a")
        assertTrue(all.get()!!)
        collection.add("b")
        assertFalse(all.get()!!)

        collection.clear()
        assertTrue(all.get()!!)
    }

    @Test
    fun anyTest() {
        val collection = ObservableArrayList<String>()
        val any = ObservableCollections.any(collection, STARTS_WITH_A)

        assertFalse(any.get()!!)

        collection.add("b")
        assertFalse(any.get()!!)
        collection.add("a")
        assertTrue(any.get()!!)

        collection.clear()
        assertFalse(any.get()!!)
    }

    private fun runChanges(collection: ObservableList<String>, count: Supplier<out Int>) {
        assertEquals(0, count.get())

        collection.add("a")
        assertEquals(1, count.get())
        collection.add("b")
        assertEquals(1, count.get())
        collection.add("a")
        assertEquals(2, count.get())
        collection.add("b")
        assertEquals(2, count.get())

        collection.removeAt(1)
        assertEquals(2, count.get())
        collection.removeAt(1)
        assertEquals(1, count.get())

        collection.clear()
        assertEquals(0, count.get())
    }
}