package jetbrains.datalore.plot.builder.sampling.method

import jetbrains.datalore.base.gcommon.base.Preconditions.checkArgument
import jetbrains.datalore.plot.builder.sampling.method.SystematicSampling.Companion.computeStep
import jetbrains.datalore.visualization.plot.base.DataFrame

internal class GroupSystematicSampling(sampleSize: Int) : GroupSamplingBase(sampleSize) {

    override val expressionText: String
        get() = "sampling_" + ALIAS + "(" +
                "n=" + sampleSize +
                ")"

    override fun isApplicable(population: DataFrame, groupMapper: (Int) -> Int, groupCount: Int): Boolean {
        return super.isApplicable(population, groupMapper, groupCount) && computeStep(groupCount, sampleSize) >= 2
    }

    override fun apply(population: DataFrame, groupMapper: (Int) -> Int): DataFrame {
        checkArgument(isApplicable(population, groupMapper))
        val distinctGroups = SamplingUtil.distinctGroups(
            groupMapper,
            population.rowCount()
        )
        val step = computeStep(distinctGroups.size, sampleSize)

        val pickedGroups = HashSet<Int>()
        var i = 0
        while (i < distinctGroups.size) {
            pickedGroups.add(distinctGroups[i])
            i += step
        }

        return doSelect(population, pickedGroups, groupMapper)
    }

    companion object {
        const val ALIAS = "group_systematic"
    }
}