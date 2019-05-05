package jetbrains.datalore.visualization.plot.gog.server.core.data.stat

import jetbrains.datalore.visualization.plot.gog.common.data.SeriesUtil
import jetbrains.datalore.visualization.plot.gog.core.data.DataFrame
import jetbrains.datalore.visualization.plot.gog.core.data.StatContext
import jetbrains.datalore.visualization.plot.gog.core.data.TransformVar
import jetbrains.datalore.visualization.plot.gog.core.data.stat.*
import org.apache.commons.math3.linear.BlockRealMatrix
import java.util.*

class Density2dStat internal constructor() : Density2dStatShell() {

    override fun apply(data: DataFrame, statCtx: StatContext): DataFrame {
        if (!(data.has(TransformVar.X) && data.has(TransformVar.Y))) {
            return DataFrame.Builder.emptyFrame()
        }

        val xVector = data.getNumeric(TransformVar.X)
        val yVector = data.getNumeric(TransformVar.Y)

        // if no data, return empty
        if (xVector.isEmpty()) {
            return DataFrame.Builder.emptyFrame()
        }

        // if length of x and y doesn't match, throw error
        if (xVector.size != yVector.size) {
            throw RuntimeException("len(x)= " + xVector.size + " and len(y)= " + yVector.size + " doesn't match!")
        }

        val xRange = statCtx.overallXRange()
        val yRange = statCtx.overallYRange()

        val statX = ArrayList<Double>()
        val statY = ArrayList<Double>()
        val statDensity = ArrayList<Double>()

        val bandWidth = DoubleArray(2)
        bandWidth[0] = if (bandWidths != null) bandWidths!![0] else DensityStatUtil.bandWidth(bandWidthMethod, xVector)
        bandWidth[1] = if (bandWidths != null) bandWidths!![1] else DensityStatUtil.bandWidth(bandWidthMethod, yVector)

        val stepsX = DensityStatUtil.createStepValues(xRange!!, nx)
        val stepsY = DensityStatUtil.createStepValues(yRange!!, ny)

        // weight aesthetics
        //Function<Integer, Double> weightAtIndex = StatUtil.weightAtIndex(data);
        val groupWeight = StatUtil.weightVector(xVector.size, data)

        val matrixX = BlockRealMatrix(DensityStatUtil.createRawMatrix(xVector, stepsX, kernel!!, bandWidth[0], adjust, groupWeight))
        val matrixY = BlockRealMatrix(DensityStatUtil.createRawMatrix(yVector, stepsY, kernel!!, bandWidth[1], adjust, groupWeight))
        // size: nY * nX
        val matrixFinal = matrixY.multiply(matrixX.transpose())

        for (row in 0 until ny) {
            for (col in 0 until nx) {
                statX.add(stepsX[col])
                statY.add(stepsY[row])
                statDensity.add(matrixFinal.getEntry(row, col) / SeriesUtil.sum(groupWeight)!!)
                //newGroups.add((double) (int) group);
            }
        }

        if (isContour) {
            val zRange = SeriesUtil.range(statDensity)
            val levels = ContourStatUtil.computeLevels(zRange, binOptions) ?: return DataFrame.Builder.emptyFrame()

            val pathListByLevel = ContourStatUtil.computeContours(xRange, yRange, nx, ny, statDensity, levels)

            return Contour.getPathDataFrame(levels, pathListByLevel)
        } else {
            return DataFrame.Builder()
                    .putNumeric(Stats.X, statX)
                    .putNumeric(Stats.Y, statY)
                    .putNumeric(Stats.DENSITY, statDensity)
                    //.putNumericVar(Stats.GROUP, newGroups)
                    .build()
        }
    }
}