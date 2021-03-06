/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.base.observable.transform

/**
 * A dynamic transformation from a mutable object of type SourceT to a mutable object of TargetT.
 */
abstract class Transformation<SourceT, TargetT> : TerminalTransformation<TargetT>() {

    abstract val source: SourceT
}