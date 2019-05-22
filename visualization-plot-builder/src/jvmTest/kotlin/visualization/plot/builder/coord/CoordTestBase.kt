package jetbrains.datalore.visualization.plot.builder.coord

import jetbrains.datalore.base.assertion.assertEquals
import jetbrains.datalore.base.gcommon.collect.ClosedRange
import jetbrains.datalore.base.geometry.DoubleRectangle
import jetbrains.datalore.base.geometry.DoubleVector
import jetbrains.datalore.visualization.plot.base.scale.Scale2
import jetbrains.datalore.visualization.plot.base.scale.Scales
import jetbrains.datalore.visualization.plot.builder.layout.axis.GuideBreaks
import kotlin.test.assertEquals

internal open class CoordTestBase {

    var dataBounds: DoubleRectangle? = null

    /**
     * ratio - ratio between height and width of the display  (ratio = h / w)
     */
    fun tryAdjustDomains(ratio: Double, provider: CoordProvider, expectedX: ClosedRange<Double>, expectedY: ClosedRange<Double>) {

        val dataBounds = this.dataBounds
        val domainX = dataBounds!!.xRange()
        val domainY = dataBounds.yRange()
        val displaySize = unitDisplaySize(ratio)

        val domains = provider.adjustDomains(domainX, domainY, displaySize)

        assertEquals(expectedX, domains.first, "X range")
        assertEquals(expectedY, domains.second, "Y range")
    }

    /**
     * ratio - ratio between height and width of the display  (ratio = h / w)
     */
    fun tryApplyScales(ratio: Double, provider: CoordProvider, expectedMin: DoubleVector, expectedMax: DoubleVector, accuracy: DoubleVector) {

        val dataBounds = this.dataBounds
        var domainX = dataBounds!!.xRange()
        var domainY = dataBounds.yRange()
        val displaySize = unitDisplaySize(ratio)
        val domains = provider.adjustDomains(domainX, domainY, displaySize)
        domainX = domains.first
        domainY = domains.second

        val scaleX = scaleX(provider, domainX, displaySize.x)
        val scaleY = scaleY(provider, domainY, displaySize.y)

        // adapts to display size
        val actualMin = applyScales(dataBounds.origin, scaleX, scaleY)
        assertEqualPoints("min", expectedMin, actualMin, accuracy)
        val actualMax = applyScales(dataBounds.origin.add(dataBounds.dimension), scaleX, scaleY)
        assertEqualPoints("max", expectedMax, actualMax, accuracy)
    }

    companion object {
        private const val UNIT = 1.0
        private val EMPTY_BREAKS = GuideBreaks(emptyList<Any>(), emptyList(), emptyList())

        fun unitDisplaySize(ratio: Double): DoubleVector {
            val w = if (ratio > 1) UNIT else UNIT / ratio
            val h = if (ratio < 1) UNIT else UNIT * ratio
            //return new DoubleVector(UNIT, UNIT * ratio);
            return DoubleVector(w, h)
        }

        fun expand(range: ClosedRange<Double>, ratio: Double): ClosedRange<Double> {
            val span = range.upperEndpoint() - range.lowerEndpoint()
            val expand = span * (ratio - 1) / 2.0
            return ClosedRange.closed(
                    range.lowerEndpoint() - expand,
                    range.upperEndpoint() + expand
            )
        }

        fun scaleX(provider: CoordProvider, domain: ClosedRange<Double>, axisLength: Double): Scale2<Double> {
            return provider.buildAxisScaleX(
                    Scales.continuousDomainNumericRange("Test scale X"),
                    domain,
                    axisLength,
                    EMPTY_BREAKS
            )
        }

        fun scaleY(provider: CoordProvider, domain: ClosedRange<Double>, axisLength: Double): Scale2<Double> {
            return provider.buildAxisScaleY(
                    Scales.continuousDomainNumericRange("Test scale Y"),
                    domain,
                    axisLength,
                    EMPTY_BREAKS
            )
        }

        fun applyScales(p: DoubleVector, scaleX: Scale2<Double>, scaleY: Scale2<Double>): DoubleVector {
            return DoubleVector(
                    scaleX.mapper(p.x)!!,
                    scaleY.mapper(p.y)!!)
        }

        private fun assertEqualPoints(text: String, expected: DoubleVector, actual: DoubleVector, accuracy: DoubleVector) {
            assertEquals(expected.x, actual.x, accuracy.x, "$text x")
            assertEquals(expected.y, actual.y, accuracy.y, "$text y")
        }
    }
}