package jetbrains.datalore.visualization.plot.builder.event3.mockito

import org.mockito.Mockito

fun <T> eq(value: T): T {
    Mockito.eq<T>(value)
    return uninitialized()
}

private fun <T> uninitialized(): T = null as T
