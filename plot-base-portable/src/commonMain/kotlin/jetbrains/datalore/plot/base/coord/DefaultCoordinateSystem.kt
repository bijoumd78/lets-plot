/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.plot.base.coord

import jetbrains.datalore.base.geometry.DoubleVector
import jetbrains.datalore.plot.base.CoordinateSystem

internal class DefaultCoordinateSystem(private val myToClientOffsetX: (Double) -> Double, private val myToClientOffsetY: (Double) -> Double,
                                       private val myFromClientOffsetX: (Double) -> Double, private val myFromClientOffsetY: (Double) -> Double) :
    CoordinateSystem {

    override fun toClient(p: DoubleVector): DoubleVector {
        return DoubleVector(myToClientOffsetX(p.x), myToClientOffsetY(p.y))
    }

    override fun fromClient(p: DoubleVector): DoubleVector {
        return DoubleVector(myFromClientOffsetX(p.x), myFromClientOffsetY(p.y))
    }
}
