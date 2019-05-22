package jetbrains.datalore.visualization.plot.builder.event3.tooltip.layout

import jetbrains.datalore.base.assertion.assertEquals
import jetbrains.datalore.base.geometry.DoubleRectangle
import jetbrains.datalore.base.geometry.DoubleVector
import jetbrains.datalore.visualization.plot.builder.event3.TestUtil.size
import jetbrains.datalore.visualization.plot.builder.event3.TooltipManager.TooltipContent
import jetbrains.datalore.visualization.plot.builder.event3.TooltipManager.TooltipEntry
import jetbrains.datalore.visualization.plot.builder.event3.tooltip.TooltipInteractions.Companion.convertToTooltipEntry
import jetbrains.datalore.visualization.plot.builder.event3.tooltip.layout.LayoutManager.*
import jetbrains.datalore.visualization.plot.builder.event3.tooltip.layout.LayoutManager.Companion.NORMAL_STEM_LENGTH
import jetbrains.datalore.visualization.plot.builder.event3.tooltip.layout.LayoutManager.Companion.SHORT_STEM_LENGTH
import jetbrains.datalore.visualization.plot.builder.event3.tooltip.layout.LayoutManager.HorizontalAlignment.LEFT
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal open class TooltipLayoutTestBase {

    private var myArrangedTooltips: MutableList<TooltipHelper>? = null
    private var myTooltipDataProvider: TooltipDataProvider? = null

    fun createTipLayoutManagerBuilder(viewport: DoubleRectangle): TipLayoutManagerBuilder {
        val tipLayoutManagerBuilder = TipLayoutManagerBuilder(viewport)
        this.myTooltipDataProvider = tipLayoutManagerBuilder
        return tipLayoutManagerBuilder
    }

    fun arrange(layoutManagerController: TipLayoutManagerController) {
        this.myArrangedTooltips = ArrayList()

        for (tooltipEntry in layoutManagerController.arrange()) {
            val measuredTooltip = myTooltipDataProvider!![tooltipEntry.tooltipContent.text]
            myArrangedTooltips!!.add(TooltipHelper(tooltipEntry, measuredTooltip!!))
        }
    }

    fun tooltip(tooltipKey: String): TooltipHelper? {
        val strings = listOf(tooltipKey)

        for (tooltip in myArrangedTooltips!!) {
            if (tooltip.content().text == strings) {
                return tooltip
            }
        }

        return null
    }

    fun expectedSideTipY(tooltipKey: String): Double {
        val data = tooltip(tooltipKey)
        return data!!.stemCoord().y - data.rect().height / 2
    }

    fun expectedSideTipX(key: String, alignment: HorizontalAlignment): Double {
        return expectedHorizontalX(key, alignment, NORMAL_STEM_LENGTH)
    }

    private fun expectedHorizontalX(tooltipKey: String, alignment: HorizontalAlignment, stemLength: Double): Double {
        val tooltip = tooltip(tooltipKey)

        return if (alignment === HorizontalAlignment.RIGHT) {
            tooltip!!.cfgHintCoord().x + tooltip.cfgHintRadius() + stemLength
        } else if (alignment === LEFT) {
            tooltip!!.cfgHintCoord().x - tooltip.cfgHintRadius() - stemLength - tooltip.size().x
        } else {
            throw IllegalArgumentException("Center alignment is not supportd for this tooltip's kind")
        }
    }

    fun expectedAroundPointX(tooltipKey: String): Double {
        val tooltip = tooltip(tooltipKey)

        return tooltip!!.cfgHintCoord().x - tooltip.size().x / 2
    }

    fun expectedAroundPointY(tooltipKey: String, verticalAlignment: VerticalAlignment): Double {
        val tooltip = tooltip(tooltipKey)

        when (verticalAlignment) {

            LayoutManager.VerticalAlignment.TOP -> return tooltip!!.cfgHintCoord().y - tooltip.size().y - NORMAL_STEM_LENGTH - tooltip.cfgHintRadius()

            LayoutManager.VerticalAlignment.BOTTOM -> return tooltip!!.cfgHintCoord().y + NORMAL_STEM_LENGTH + tooltip.cfgHintRadius()

            else -> throw IllegalArgumentException("Placement is not supported: $verticalAlignment")
        }
    }

    fun expectedAroundPointStem(tooltipKey: String): DoubleVector {
        val tooltip = tooltip(tooltipKey)

        val hintCoord = tooltip!!.cfgHintCoord()
        val hintRadius = tooltip.cfgHintRadius()

        return hintCoord.add(size(0.0, hintRadius))
    }

    fun expectedAxisTipY(tooltipKey: String, verticalAlignment: VerticalAlignment): Double {
        val tooltip = tooltip(tooltipKey)

        when (verticalAlignment) {

            LayoutManager.VerticalAlignment.TOP -> return tooltip!!.cfgHintCoord().y - tooltip.size().y - SHORT_STEM_LENGTH
            LayoutManager.VerticalAlignment.BOTTOM -> return tooltip!!.cfgHintCoord().y + SHORT_STEM_LENGTH

            else -> throw IllegalArgumentException("Placement is not supported: $verticalAlignment")
        }
    }

    fun expectedAxisTipX(tooltipKey: String, alignment: HorizontalAlignment): Double {
        return expectedHorizontalX(tooltipKey, alignment, SHORT_STEM_LENGTH)
    }

    private fun <T> shouldCheck(v: T?): Boolean {
        return v != null
    }

    fun assertAllTooltips(vararg expectations: ExpectedTooltip) {
        assertEquals(expectations.size, myArrangedTooltips!!.size)

        var i = 0
        val n = expectations.size
        while (i < n) {
            assertExpectations(expectations[i], myArrangedTooltips!![i])
            ++i
        }
    }

    private fun assertExpectations(expectedTooltip: ExpectedTooltip, actual: TooltipHelper) {
        if (shouldCheck(expectedTooltip.text())) {
            assertEquals(makeText(expectedTooltip.text()!!), actual.content().text)
        }

        if (shouldCheck(expectedTooltip.tooltipX())) {
            assertDoubleEquals("tooltipX", expectedTooltip.tooltipX()!!, actual.coord().x)
        }

        if (shouldCheck(expectedTooltip.tooltipY())) {
            assertDoubleEquals("tooltipY", expectedTooltip.tooltipY()!!, actual.coord().y)
        }

        if (shouldCheck(expectedTooltip.stemX())) {
            assertDoubleEquals("stemX", expectedTooltip.stemX()!!, actual.stemCoord().x)
        }

        if (shouldCheck(expectedTooltip.stemY())) {
            assertDoubleEquals("stemY", expectedTooltip.stemY()!!, actual.stemCoord().y)
        }
    }

    private fun assertDoubleEquals(message: String, expected: Double, actual: Double) {
        assertEquals(expected, actual, DOUBLE_COMPARE_EPSILON, message)
    }

    fun assertInsideView(viewport: DoubleRectangle) {
        for (arrangedTooltip in myArrangedTooltips!!) {
            val tooltip = arrangedTooltip.rect()
            for (side in tooltip.parts) {
                assertTrue(viewport.contains(side.start))
                assertTrue(viewport.contains(side.end))
            }
        }
    }

    fun expect(): ExpectedTooltip {
        return ExpectedTooltip()
    }

    fun expect(tooltipKey: String): ExpectedTooltip {
        return ExpectedTooltip().text(tooltipKey)

    }

    fun orderedListOf(count: Int): Array<ExpectedTooltip> {
        val expectedTooltips = ArrayList<ExpectedTooltip>()
        for (i in 0 until count) {
            expectedTooltips.add(expect().text((i + 1).toString()))
        }

        return expectedTooltips.toTypedArray()
    }

    internal interface TipLayoutManagerController {
        fun arrange(): List<TooltipEntry>
    }

    internal interface TooltipDataProvider {
        operator fun get(text: List<String>): MeasuredTooltip?
    }

    internal class TipLayoutManagerBuilder(private val myViewport: DoubleRectangle) : TooltipDataProvider {
        private val myTooltipData = ArrayList<MeasuredTooltip>()
        private val myHorizontalAlignment: HorizontalAlignment = LEFT
        private var myCursor = DoubleVector.ZERO

        fun cursor(cursor: DoubleVector): TipLayoutManagerBuilder {
            myCursor = cursor
            return this
        }

        fun addTooltip(measuredTooltip: MeasuredTooltip): TipLayoutManagerBuilder {
            myTooltipData.add(measuredTooltip)
            return this
        }

        fun build(): TipLayoutManagerController {
            return object : TipLayoutManagerController {
                override fun arrange(): List<TooltipEntry> = convertToTooltipEntry(
                        LayoutManager(myViewport, myHorizontalAlignment).arrange(myTooltipData, myCursor)
                )
            }
        }

        override fun get(text: List<String>): MeasuredTooltip? {
            for (measuredTooltip in myTooltipData) {
                if (measuredTooltip.tooltipSpec.lines == text) {
                    return measuredTooltip
                }
            }
            return null
        }
    }

    internal class TooltipHelper(private val myTooltipEntry: TooltipEntry, private val myMeasuredTooltip: MeasuredTooltip) {
        private val myHintRadius: Double = myMeasuredTooltip.hintRadius
        private val myTooltipRect: DoubleRectangle = DoubleRectangle(myTooltipEntry.tooltipCoord, myMeasuredTooltip.size)

        fun coord(): DoubleVector {
            return myTooltipEntry.tooltipCoord
        }

        fun stemCoord(): DoubleVector {
            return myTooltipEntry.stemCoord
        }

        fun rect(): DoubleRectangle {
            return myTooltipRect
        }

        fun content(): TooltipContent {
            return myTooltipEntry.tooltipContent
        }


        fun size(): DoubleVector {
            return myMeasuredTooltip.size
        }

        fun cfgHintRadius(): Double {
            return myHintRadius
        }

        fun cfgHintCoord(): DoubleVector {
            return myMeasuredTooltip.hintCoord
        }
    }

    internal class ExpectedTooltip {
        private var text: String? = null
        private var tooltipX: Double? = null
        private var tooltipY: Double? = null
        private var stemX: Double? = null
        private var stemY: Double? = null

        fun text(text: String): ExpectedTooltip {
            this.text = text
            return this
        }

        fun tooltipX(tooltipX: Double?): ExpectedTooltip {
            this.tooltipX = tooltipX
            return this
        }

        fun tooltipY(tooltipY: Double?): ExpectedTooltip {
            this.tooltipY = tooltipY
            return this
        }

        fun tooltipCoord(tooltipCoord: DoubleVector): ExpectedTooltip {
            this.tooltipX = tooltipCoord.x
            this.tooltipY = tooltipCoord.y
            return this
        }

        fun stemCoord(stemCoord: DoubleVector): ExpectedTooltip {
            this.stemX = stemCoord.x
            this.stemY = stemCoord.y
            return this
        }

        fun text(): String? {
            return text
        }

        fun tooltipX(): Double? {
            return tooltipX
        }

        fun tooltipY(): Double? {
            return tooltipY
        }

        fun stemX(): Double? {
            return stemX
        }

        fun stemY(): Double? {
            return stemY
        }
    }

    companion object {
        val VIEWPORT = DoubleRectangle(0.0, 0.0, 500.0, 500.0)
        val DEFAULT_TOOLTIP_SIZE = DoubleVector(80.0, 40.0)

        val DEFAULT_OBJECT_RADIUS = 40.0
        private val DOUBLE_COMPARE_EPSILON = 0.01

        fun makeText(text: String): List<String> {
            val textList = ArrayList<String>()
            textList.add(text)
            return textList
        }
    }
}