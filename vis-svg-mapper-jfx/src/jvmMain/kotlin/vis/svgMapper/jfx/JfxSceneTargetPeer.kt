package jetbrains.datalore.vis.svgMapper.jfx

import javafx.scene.Group
import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.scene.shape.Rectangle
import javafx.scene.shape.SVGPath
import javafx.scene.text.Text
import jetbrains.datalore.base.registration.Registration
import jetbrains.datalore.vis.svg.SvgElement
import jetbrains.datalore.vis.svg.SvgTextNode
import jetbrains.datalore.vis.svg.event.SvgEventSpec
import jetbrains.datalore.vis.svg.slim.SvgSlimElements
import jetbrains.datalore.vis.svg.slim.SvgSlimNode
import jetbrains.datalore.vis.svgMapper.TargetPeer

internal class JfxSceneTargetPeer : TargetPeer<Node> {
    override fun appendChild(target: Node, child: Node) {
        jetbrains.datalore.vis.svgMapper.jfx.Utils.getChildren(target as Parent).add(child)
    }

    override fun removeAllChildren(target: Node) {
        if (target is Parent) {
            jetbrains.datalore.vis.svgMapper.jfx.Utils.getChildren(target).clear()
        }
    }

    override fun newSvgElement(source: SvgElement): Node {
        return jetbrains.datalore.vis.svgMapper.jfx.Utils.newSceneNode(source)
    }

    override fun newSvgTextNode(source: SvgTextNode): Node {
        return Text(source.textContent().get())
    }

    override fun newSvgSlimNode(source: SvgSlimNode): Node {
        return when (source.elementName) {
            SvgSlimElements.GROUP -> Group()
            SvgSlimElements.LINE -> Line()
            SvgSlimElements.CIRCLE -> Circle()
            SvgSlimElements.RECT -> Rectangle()
            SvgSlimElements.PATH -> SVGPath()
            else -> throw IllegalStateException("Unsupported slim node " + source::class.simpleName + " '" + source.elementName + "'")
        }
    }

    override fun setAttribute(target: Node, name: String, value: String) {
        jetbrains.datalore.vis.svgMapper.jfx.Utils.setAttribute(target, name, value)
    }

    override fun hookEventHandlers(source: SvgElement, target: Node, eventSpecs: Set<SvgEventSpec>): Registration {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}