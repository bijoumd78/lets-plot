/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.base.edt

import jetbrains.datalore.base.async.Async
import jetbrains.datalore.base.async.Asyncs
import jetbrains.datalore.base.async.ThreadSafeAsync
import jetbrains.datalore.base.function.Consumer
import jetbrains.datalore.base.registration.Registration
import java.util.concurrent.atomic.AtomicBoolean

actual class SafeAsync<ItemT> actual constructor() : Async<ItemT> {
    private val myAsync: ThreadSafeAsync<ItemT> = ThreadSafeAsync()
    private val myFulfilled: AtomicBoolean = AtomicBoolean(false)

    internal fun success(result: ItemT) {
        if (notFulfilled()) {
            myAsync.success(result)
        }
    }

    internal fun fail(t: Throwable) {
        if (notFulfilled()) {
            myAsync.failure(t)
        }
    }

    internal fun delegate(async: Async<ItemT>) {
        if (notFulfilled()) {
            Asyncs.delegate(async, myAsync)
        }
    }

    private fun notFulfilled(): Boolean {
        return myFulfilled.compareAndSet(false, true)
    }

    override fun onSuccess(successHandler: Consumer<in ItemT>): Registration {
        return myAsync.onSuccess(successHandler)
    }

    override fun onResult(successHandler: Consumer<in ItemT>, failureHandler: Consumer<Throwable>): Registration {
        return myAsync.onResult(successHandler, failureHandler)
    }

    override fun onFailure(failureHandler: Consumer<Throwable>): Registration {
        return myAsync.onFailure(failureHandler)
    }

    override fun <ResultT> map(success: (ItemT) -> ResultT): Async<ResultT> {
        return myAsync.map(success)
    }

    override fun <ResultT> flatMap(success: (ItemT) -> Async<ResultT>?): Async<ResultT?> {
        return myAsync.flatMap(success)
    }
}
