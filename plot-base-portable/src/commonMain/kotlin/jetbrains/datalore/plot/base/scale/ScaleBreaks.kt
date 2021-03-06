/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.plot.base.scale

class ScaleBreaks(domainValues: List<Double>, transformValues: List<Double>, labels: List<String>) {
    val domainValues: List<Double> = ArrayList(domainValues)
    val transformValues: List<Double> = ArrayList(transformValues)
    val labels: List<String> = ArrayList(labels)
}
