package jetbrains.datalore.visualization.plot.base.geom

import jetbrains.datalore.visualization.plot.base.Aes

class Density2dfGeom : ContourfGeom() {
    companion object {
        val RENDERS: List<Aes<*>> = ContourfGeom.RENDERS

        val HANDLES_GROUPS = ContourfGeom.HANDLES_GROUPS
    }
}