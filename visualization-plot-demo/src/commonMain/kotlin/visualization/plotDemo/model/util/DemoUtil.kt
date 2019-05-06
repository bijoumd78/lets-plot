package jetbrains.datalore.visualization.plotDemo.model.util

import jetbrains.datalore.visualization.plot.gog.core.render.Aesthetics
import jetbrains.datalore.visualization.plot.gog.core.render.GeomContext
import jetbrains.datalore.visualization.plot.gog.plot.assemble.GeomContextBuilder
import kotlin.math.ln
import kotlin.math.sqrt
import kotlin.random.Random

private class RandomGaussian(val random: Random) {
    private var nextNextGaussian: Double = 0.0
    private var haveNextNextGaussian = false

    // From JDK Random (but not as good)
    fun nextGaussian(): Double {
        // See Knuth, ACP, Section 3.4.1 Algorithm C.
        if (haveNextNextGaussian) {
            haveNextNextGaussian = false
            return nextNextGaussian
        } else {
            var v1: Double
            var v2: Double
            var s: Double
            do {
                v1 = 2 * random.nextDouble() - 1 // between -1 and 1
                v2 = 2 * random.nextDouble() - 1 // between -1 and 1
                s = v1 * v1 + v2 * v2
            } while (s >= 1 || s == 0.0)
            val multiplier = sqrt(-2 * ln(s) / s)
            nextNextGaussian = v2 * multiplier
            haveNextNextGaussian = true
            return v1 * multiplier
        }
    }
}


object DemoUtil {
    fun gauss(count: Int, seed: Long, mean: Double, stdDeviance: Double): List<Double> {
        val r = RandomGaussian(Random(seed))
        val list = ArrayList<Double>()
        for (i in 0 until count) {
            val next = r.nextGaussian() * stdDeviance + mean
            list.add(next)
        }
        return list
    }

    fun naturals(count: Int): List<Double> {
        val l = ArrayList<Double>()
        for (i in 0 until count) {
            l.add(i.toDouble())
        }
        return l
    }

    fun <T> zip(l1: List<T>, l2: List<T>): List<T> {
        val l = ArrayList<T>()
        val i1 = l1.iterator()
        val i2 = l2.iterator()
        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext()) {
                l.add(i1.next())
            }
            if (i2.hasNext()) {
                l.add(i2.next())
            }
        }
        return l
    }

    fun <T> fill(v: T, count: Int): List<T> {
        val l = ArrayList<T>()
        for (i in 0 until count) {
            l.add(v)
        }
        return l
    }

    fun add(l1: List<Double>, l2: List<Double>): List<Double> {
        val result = ArrayList<Double>()
        val l1_ = l1.iterator()
        val l2_ = l2.iterator()
        while (l1_.hasNext()) {
            val v1 = l1_.next()
            val v2 = l2_.next()
            result.add(v1 + v2)
        }
        return result
    }

    fun sub(l1: List<Double>, l2: List<Double>): List<Double> {
        val result = ArrayList<Double>()
        val l1_ = l1.iterator()
        val l2_ = l2.iterator()
        while (l1_.hasNext()) {
            val v1 = l1_.next()
            val v2 = l2_.next()
            result.add(v1 - v2)
        }
        return result
    }

    fun geomContext(aes: Aesthetics): GeomContext {
        return GeomContextBuilder().aesthetics(aes).build()
    }
}
