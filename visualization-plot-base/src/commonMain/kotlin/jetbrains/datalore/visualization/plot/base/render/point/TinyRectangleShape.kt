package jetbrains.datalore.visualization.plot.base.render.point

import jetbrains.datalore.visualization.plot.base.DataPointAesthetics

internal class TinyRectangleShape private constructor() : PointShape {

    override val code: Int
        get() = 46 // ASCII dot `.`

    override fun size(dataPoint: DataPointAesthetics): Double {
        return 1.0
    }

    override fun strokeWidth(dataPoint: DataPointAesthetics): Double {
        return 0.0
    }

//    override fun create(location: DoubleVector, dataPoint: DataPointAesthetics): SvgSlimObject {
//        val r = SvgSlimElements.rect(location.x - 0.5, location.y - 0.5, 1.0, 1.0)
//        val color = dataPoint.color()!!
//        val alpha = AestheticsUtil.alpha(color, dataPoint)
//        r.setFill(color, alpha)
//        r.setStrokeWidth(0.0)
//        return r
//    }

    companion object {
        val INSTANCE = TinyRectangleShape()
    }
}
