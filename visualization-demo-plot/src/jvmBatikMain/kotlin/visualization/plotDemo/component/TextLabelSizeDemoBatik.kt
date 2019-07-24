package jetbrains.datalore.visualization.plotDemo.component

import jetbrains.datalore.visualization.base.swing.BatikMapperDemoFrame
import jetbrains.datalore.visualization.plotDemo.model.component.TextLabelSizeDemo

fun main() {
    with(TextLabelSizeDemo()) {
        val demoModels = listOf(createModel())
        val svgRoots = createSvgRoots(demoModels)
        BatikMapperDemoFrame.showSvg(svgRoots, demoComponentSize, "Text label size and style")
    }
}