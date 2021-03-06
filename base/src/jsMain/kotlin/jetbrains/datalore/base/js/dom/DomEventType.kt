/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.base.js.dom

class DomEventType<EventT : DomBaseEvent> private constructor(val name: String) {
    companion object {

        val BLUR = DomEventType<DomBaseEvent>("blur")
        val CHANGE = DomEventType<DomBaseEvent>("change")
        val INPUT = DomEventType<DomBaseEvent>("input")
        val PASTE = DomEventType<DomBaseEvent>("paste")
        val RESIZE = DomEventType<DomBaseEvent>("resize")
        val CLICK = DomEventType<DomMouseEvent>("click")
        val CONTEXT_MENU = DomEventType<DomMouseEvent>("contextmenu")
        val DOUBLE_CLICK = DomEventType<DomMouseEvent>("dblclick")
        val DRAG = DomEventType<DomDragEvent>("drag")
        val DRAG_END = DomEventType<DomDragEvent>("dragend")
        val DRAG_ENTER = DomEventType<DomDragEvent>("dragenter")
        val DRAG_LEAVE = DomEventType<DomDragEvent>("dragleave")
        val DRAG_OVER = DomEventType<DomDragEvent>("dragover")
        val DRAG_START = DomEventType<DomDragEvent>("dragstart")
        val DROP = DomEventType<DomDragEvent>("drop")
        val FOCUS = DomEventType<DomBaseEvent>("focus")
        val FOCUS_IN = DomEventType<DomBaseEvent>("focusin")
        val FOCUS_OUT = DomEventType<DomBaseEvent>("focusout")
        val KEY_DOWN = DomEventType<DomKeyEvent>("keydown")
        val KEY_PRESS = DomEventType<DomKeyEvent>("keypress")
        val KEY_UP = DomEventType<DomKeyEvent>("keyup")
        val LOAD = DomEventType<DomBaseEvent>("load")
        val MOUSE_ENTER = DomEventType<DomMouseEvent>("mouseenter")
        val MOUSE_LEAVE = DomEventType<DomMouseEvent>("mouseleave")
        val MOUSE_DOWN = DomEventType<DomMouseEvent>("mousedown")
        val MOUSE_MOVE = DomEventType<DomMouseEvent>("mousemove")
        val MOUSE_OUT = DomEventType<DomMouseEvent>("mouseout")
        val MOUSE_OVER = DomEventType<DomMouseEvent>("mouseover")
        val MOUSE_UP = DomEventType<DomMouseEvent>("mouseup")
        val MOUSE_WHEEL = DomEventType<DomWheelEvent>("wheel")
        val SCROLL = DomEventType<DomBaseEvent>("scroll")
        val TOUCH_CANCEL = DomEventType<DomBaseEvent>("touchcancel")
        val TOUCH_END = DomEventType<DomBaseEvent>("touchend")
        val TOUCH_MOVE = DomEventType<DomBaseEvent>("touchmove")
        val TOUCH_START = DomEventType<DomBaseEvent>("touchstart")
        val COMPOSITION_START = DomEventType<DomBaseEvent>("compositionstart")
        val COMPOSITION_END = DomEventType<DomBaseEvent>("compositionend")
        val COMPOSITION_UPDATE = DomEventType<DomBaseEvent>("compositionupdate")
        val MESSAGE = DomEventType<DomMessageEvent>("message")

        val XHR_PROGRESS = DomEventType<DomProgressEvent>("progress")
        val XHR_LOAD = DomEventType<DomProgressEvent>("load")
        val XHR_LOAD_START = DomEventType<DomProgressEvent>("loadstart")
        val XHR_LOAD_END = DomEventType<DomProgressEvent>("loadend")
        val XHR_ABORT = DomEventType<DomBaseEvent>("abort")
        val XHR_ERROR = DomEventType<DomBaseEvent>("error")
    }
}
