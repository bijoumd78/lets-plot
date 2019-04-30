package jetbrains.datalore.visualization.plot.gog.plot.assemble

import jetbrains.datalore.base.gcommon.base.Preconditions.checkState
import jetbrains.datalore.base.gcommon.collect.ClosedRange
import jetbrains.datalore.visualization.plot.core.AestheticsDefaults
import jetbrains.datalore.visualization.plot.gog.common.data.SeriesUtil
import jetbrains.datalore.visualization.plot.gog.core.data.DataFrame
import jetbrains.datalore.visualization.plot.gog.core.render.Aes
import jetbrains.datalore.visualization.plot.gog.core.render.LegendKeyElementFactory
import jetbrains.datalore.visualization.plot.gog.plot.GeomLayer
import jetbrains.datalore.visualization.plot.gog.plot.VarBinding

internal class StitchedPlotLayers(layers: List<GeomLayer>) {
    private val myLayers: List<GeomLayer>

    val legendKeyElementFactory: LegendKeyElementFactory
        get() {
            checkState(!myLayers.isEmpty())
            return myLayers[0].legendKeyElementFactory
        }

    val aestheticsDefaults: AestheticsDefaults
        get() {
            checkState(!myLayers.isEmpty())
            return myLayers[0].aestheticsDefaults
        }

    val isLegendDisabled: Boolean
        get() {
            checkState(!myLayers.isEmpty())
            return myLayers[0].isLegendDisabled
        }

    init {
        myLayers = ArrayList(layers)
    }

    fun renderedAes(): List<Aes<*>> {
        return if (myLayers.isEmpty()) {
            emptyList()
        } else myLayers[0].renderedAes()
    }

    fun hasBinding(aes: Aes<*>): Boolean {
        return !myLayers.isEmpty() && myLayers[0].hasBinding(aes)
    }

    fun hasConstant(aes: Aes<*>): Boolean {
        return !myLayers.isEmpty() && myLayers[0].hasConstant(aes)
    }

    fun <T> getConstant(aes: Aes<T>): T {
        checkState(!myLayers.isEmpty())
        return myLayers[0].getConstant(aes)
    }

    fun getBinding(aes: Aes<*>): VarBinding {
        checkState(!myLayers.isEmpty())
        return myLayers[0].getBinding(aes)
    }

    fun getDataRange(`var`: DataFrame.Variable): ClosedRange<Double>? {
        checkState(isNumericData(`var`), "Not numeric data [$`var`]")
        var result: ClosedRange<Double>? = null
        for (layer in myLayers) {
            val range = layer.dataFrame.range(`var`)
            result = SeriesUtil.span(result, range)
        }
        return result
    }

    fun isNumericData(`var`: DataFrame.Variable): Boolean {
        checkState(!myLayers.isEmpty())
        for (layer in myLayers) {
            if (!layer.dataFrame.isNumeric(`var`)) {
                return false
            }
        }
        return true
    }
}