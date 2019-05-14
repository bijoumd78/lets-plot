package jetbrains.datalore.visualization.plot.gog.core.render.pos

import jetbrains.datalore.base.geometry.DoubleVector
import jetbrains.datalore.base.values.Pair
import jetbrains.datalore.visualization.plot.gog.common.data.SeriesUtil
import jetbrains.datalore.visualization.plot.gog.core.render.Aesthetics
import jetbrains.datalore.visualization.plot.gog.core.render.DataPointAesthetics
import jetbrains.datalore.visualization.plot.gog.core.render.GeomContext
import jetbrains.datalore.visualization.plot.gog.core.render.PositionAdjustment
import jetbrains.datalore.visualization.plot.gog.core.util.MutableDouble

internal abstract class StackPos(aes: Aesthetics) : PositionAdjustment {

    private val myOffsetByIndex: Map<Int, Double>

    init {
        myOffsetByIndex = mapIndexToOffset(aes)
    }

    protected abstract fun mapIndexToOffset(aes: Aesthetics): Map<Int, Double>

    override fun translate(v: DoubleVector, p: DataPointAesthetics, ctx: GeomContext): DoubleVector {
        return v.add(DoubleVector(0.0, myOffsetByIndex[p.index()]!!))
    }

    override fun handlesGroups(): Boolean {
        return PositionAdjustments.Meta.STACK.handlesGroups()
    }

    private class SplitPositiveNegative internal constructor(aes: Aesthetics) : StackPos(aes) {

        override fun mapIndexToOffset(aes: Aesthetics): Map<Int, Double> {
            val offsetByIndex = HashMap<Int, Double>()
            val negPosBaseByBin = HashMap<Double, Pair<MutableDouble, MutableDouble>>()
            for (i in 0 until aes.dataPointCount()) {
                val dataPoint = aes.dataPointAt(i)
                val x = dataPoint.x()
                if (SeriesUtil.isFinite(x)) {
                    if (!negPosBaseByBin.containsKey(x)) {
                        negPosBaseByBin[x!!] = Pair(MutableDouble(0.0), MutableDouble(0.0))
                    }

                    val y = dataPoint.y()
                    if (SeriesUtil.isFinite(y)) {
                        val pair = negPosBaseByBin[x]!!
                        val offset: Double
                        if (y!! >= 0) {
                            offset = pair.second.getAndAdd(y)
                        } else {
                            offset = pair.first.getAndAdd(y)
                        }
                        offsetByIndex[i] = offset
                    }
                }
            }

            return offsetByIndex
        }

    }

    private class SumPositiveNegative internal constructor(aes: Aesthetics) : StackPos(aes) {

        override fun mapIndexToOffset(aes: Aesthetics): Map<Int, Double> {
            val offsetByIndex = HashMap<Int, Double>()
            val baseByBin = HashMap<Double, MutableDouble>()
            for (i in 0 until aes.dataPointCount()) {
                val dataPointAes = aes.dataPointAt(i)
                val x = dataPointAes.x()!!
                if (SeriesUtil.isFinite(x)) {
                    if (!baseByBin.containsKey(x)) {
                        baseByBin[x] = MutableDouble(0.0)
                    }

                    val y = dataPointAes.y()!!
                    if (SeriesUtil.isFinite(y)) {
                        val base = baseByBin[x]!!
                        val offset = base.getAndAdd(y)
                        offsetByIndex[i] = offset
                    }
                }
            }

            return offsetByIndex
        }
    }

    companion object {
        fun splitPositiveNegative(aes: Aesthetics): PositionAdjustment {
            return SplitPositiveNegative(aes)
        }

        fun sumPositiveNegative(aes: Aesthetics): PositionAdjustment {
            return SumPositiveNegative(aes)
        }
    }

}
