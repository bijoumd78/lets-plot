/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.datalore.plot.common.color

/**
 * source: colorbrewer2.org/
 */
internal object ColorSets {
    // --------------------
    // sequential multi-hue
    // --------------------
    // blue - green
    val BU_GN_3 = arrayOf("#e5f5f9", "#99d8c9", "#2ca25f")
    val BU_GN_4 = arrayOf("#edf8fb", "#b2e2e2", "#66c2a4", "#238b45")
    val BU_GN_5 = arrayOf("#edf8fb", "#b2e2e2", "#66c2a4", "#2ca25f", "#006d2c")
    val BU_GN_6 = arrayOf("#edf8fb", "#ccece6", "#99d8c9", "#66c2a4", "#2ca25f", "#006d2c")
    val BU_GN_7 = arrayOf("#edf8fb", "#ccece6", "#99d8c9", "#66c2a4", "#41ae76", "#238b45", "#005824")
    val BU_GN_8 = arrayOf("#f7fcfd", "#e5f5f9", "#ccece6", "#99d8c9", "#66c2a4", "#41ae76", "#238b45", "#005824")
    val BU_GN_9 = arrayOf("#f7fcfd", "#e5f5f9", "#ccece6", "#99d8c9", "#66c2a4", "#41ae76", "#238b45", "#006d2c", "#00441b")
    // blue - purple
    val BU_PU_3 = arrayOf("#e0ecf4", "#9ebcda", "#8856a7")
    val BU_PU_4 = arrayOf("#edf8fb", "#b3cde3", "#8c96c6", "#88419d")
    val BU_PU_5 = arrayOf("#edf8fb", "#b3cde3", "#8c96c6", "#8856a7", "#810f7c")
    val BU_PU_6 = arrayOf("#edf8fb", "#bfd3e6", "#9ebcda", "#8c96c6", "#8856a7", "#810f7c")
    val BU_PU_7 = arrayOf("#edf8fb", "#bfd3e6", "#9ebcda", "#8c96c6", "#8c6bb1", "#88419d", "#6e016b")
    val BU_PU_8 = arrayOf("#f7fcfd", "#e0ecf4", "#bfd3e6", "#9ebcda", "#8c96c6", "#8c6bb1", "#88419d", "#6e016b")
    val BU_PU_9 = arrayOf("#f7fcfd", "#e0ecf4", "#bfd3e6", "#9ebcda", "#8c96c6", "#8c6bb1", "#88419d", "#810f7c", "#4d004b")
    // green - blue
    val GN_BU_3 = arrayOf("#e0f3db", "#a8ddb5", "#43a2ca")
    val GN_BU_4 = arrayOf("#f0f9e8", "#bae4bc", "#7bccc4", "#2b8cbe")
    val GN_BU_5 = arrayOf("#f0f9e8", "#bae4bc", "#7bccc4", "#43a2ca", "#0868ac")
    val GN_BU_6 = arrayOf("#f0f9e8", "#ccebc5", "#a8ddb5", "#7bccc4", "#43a2ca", "#0868ac")
    val GN_BU_7 = arrayOf("#f0f9e8", "#ccebc5", "#a8ddb5", "#7bccc4", "#4eb3d3", "#2b8cbe", "#08589e")
    val GN_BU_8 = arrayOf("#f7fcf0", "#e0f3db", "#ccebc5", "#a8ddb5", "#7bccc4", "#4eb3d3", "#2b8cbe", "#08589e")
    val GN_BU_9 = arrayOf("#f7fcf0", "#e0f3db", "#ccebc5", "#a8ddb5", "#7bccc4", "#4eb3d3", "#2b8cbe", "#0868ac", "#084081")
    // orange - red
    val OR_RD_3 = arrayOf("#fee8c8", "#fdbb84", "#e34a33")
    val OR_RD_4 = arrayOf("#fef0d9", "#fdcc8a", "#fc8d59", "#d7301f")
    val OR_RD_5 = arrayOf("#fef0d9", "#fdcc8a", "#fc8d59", "#e34a33", "#b30000")
    val OR_RD_6 = arrayOf("#fef0d9", "#fdd49e", "#fdbb84", "#fc8d59", "#e34a33", "#b30000")
    val OR_RD_7 = arrayOf("#fef0d9", "#fdd49e", "#fdbb84", "#fc8d59", "#ef6548", "#d7301f", "#990000")
    val OR_RD_8 = arrayOf("#fff7ec", "#fee8c8", "#fdd49e", "#fdbb84", "#fc8d59", "#ef6548", "#d7301f", "#990000")
    val OR_RD_9 = arrayOf("#fff7ec", "#fee8c8", "#fdd49e", "#fdbb84", "#fc8d59", "#ef6548", "#d7301f", "#b30000", "#7f0000")
    // purple - blue
    val PU_BU_3 = arrayOf("#ece7f2", "#a6bddb", "#2b8cbe")
    val PU_BU_4 = arrayOf("#f1eef6", "#bdc9e1", "#74a9cf", "#0570b0")
    val PU_BU_5 = arrayOf("#f1eef6", "#bdc9e1", "#74a9cf", "#2b8cbe", "#045a8d")
    val PU_BU_6 = arrayOf("#f1eef6", "#d0d1e6", "#a6bddb", "#74a9cf", "#2b8cbe", "#045a8d")
    val PU_BU_7 = arrayOf("#f1eef6", "#d0d1e6", "#a6bddb", "#74a9cf", "#3690c0", "#0570b0", "#034e7b")
    val PU_BU_8 = arrayOf("#fff7fb", "#ece7f2", "#d0d1e6", "#a6bddb", "#74a9cf", "#3690c0", "#0570b0", "#034e7b")
    val PU_BU_9 = arrayOf("#fff7fb", "#ece7f2", "#d0d1e6", "#a6bddb", "#74a9cf", "#3690c0", "#0570b0", "#045a8d", "#023858")
    // purple - blue - green
    val PU_BU_GN_3 = arrayOf("#ece2f0", "#a6bddb", "#1c9099")
    val PU_BU_GN_4 = arrayOf("#f6eff7", "#bdc9e1", "#67a9cf", "#02818a")
    val PU_BU_GN_5 = arrayOf("#f6eff7", "#bdc9e1", "#67a9cf", "#1c9099", "#016c59")
    val PU_BU_GN_6 = arrayOf("#f6eff7", "#d0d1e6", "#a6bddb", "#67a9cf", "#1c9099", "#016c59")
    val PU_BU_GN_7 = arrayOf("#f6eff7", "#d0d1e6", "#a6bddb", "#67a9cf", "#3690c0", "#02818a", "#016450")
    val PU_BU_GN_8 = arrayOf("#fff7fb", "#ece2f0", "#d0d1e6", "#a6bddb", "#67a9cf", "#3690c0", "#02818a", "#016450")
    val PU_BU_GN_9 = arrayOf("#fff7fb", "#ece2f0", "#d0d1e6", "#a6bddb", "#67a9cf", "#3690c0", "#02818a", "#016c59", "#014636")
    // purple - red
    val PU_RD_3 = arrayOf("#e7e1ef", "#c994c7", "#dd1c77")
    val PU_RD_4 = arrayOf("#f1eef6", "#d7b5d8", "#df65b0", "#ce1256")
    val PU_RD_5 = arrayOf("#f1eef6", "#d7b5d8", "#df65b0", "#dd1c77", "#980043")
    val PU_RD_6 = arrayOf("#f1eef6", "#d4b9da", "#c994c7", "#df65b0", "#dd1c77", "#980043")
    val PU_RD_7 = arrayOf("#f1eef6", "#d4b9da", "#c994c7", "#df65b0", "#e7298a", "#ce1256", "#91003f")
    val PU_RD_8 = arrayOf("#f7f4f9", "#e7e1ef", "#d4b9da", "#c994c7", "#df65b0", "#e7298a", "#ce1256", "#91003f")
    val PU_RD_9 = arrayOf("#f7f4f9", "#e7e1ef", "#d4b9da", "#c994c7", "#df65b0", "#e7298a", "#ce1256", "#980043", "#67001f")
    // red - purple
    val RD_PU_3 = arrayOf("#fde0dd", "#fa9fb5", "#c51b8a")
    val RD_PU_4 = arrayOf("#feebe2", "#fbb4b9", "#f768a1", "#ae017e")
    val RD_PU_5 = arrayOf("#feebe2", "#fbb4b9", "#f768a1", "#c51b8a", "#7a0177")
    val RD_PU_6 = arrayOf("#feebe2", "#fcc5c0", "#fa9fb5", "#f768a1", "#c51b8a", "#7a0177")
    val RD_PU_7 = arrayOf("#feebe2", "#fcc5c0", "#fa9fb5", "#f768a1", "#dd3497", "#ae017e", "#7a0177")
    val RD_PU_8 = arrayOf("#fff7f3", "#fde0dd", "#fcc5c0", "#fa9fb5", "#f768a1", "#dd3497", "#ae017e", "#7a0177")
    val RD_PU_9 = arrayOf("#fff7f3", "#fde0dd", "#fcc5c0", "#fa9fb5", "#f768a1", "#dd3497", "#ae017e", "#7a0177", "#49006a")
    // yellow - green
    val YL_GN_3 = arrayOf("#f7fcb9", "#addd8e", "#31a354")
    val YL_GN_4 = arrayOf("#ffffcc", "#c2e699", "#78c679", "#238443")
    val YL_GN_5 = arrayOf("#ffffcc", "#c2e699", "#78c679", "#31a354", "#006837")
    val YL_GN_6 = arrayOf("#ffffcc", "#d9f0a3", "#addd8e", "#78c679", "#31a354", "#006837")
    val YL_GN_7 = arrayOf("#ffffcc", "#d9f0a3", "#addd8e", "#78c679", "#41ab5d", "#238443", "#005a32")
    val YL_GN_8 = arrayOf("#ffffe5", "#f7fcb9", "#d9f0a3", "#addd8e", "#78c679", "#41ab5d", "#238443", "#005a32")
    val YL_GN_9 = arrayOf("#ffffe5", "#f7fcb9", "#d9f0a3", "#addd8e", "#78c679", "#41ab5d", "#238443", "#006837", "#004529")
    // yellow - green - blue
    val YL_GN_BU_3 = arrayOf("#edf8b1", "#7fcdbb", "#2c7fb8")
    val YL_GN_BU_4 = arrayOf("#ffffcc", "#a1dab4", "#41b6c4", "#225ea8")
    val YL_GN_BU_5 = arrayOf("#ffffcc", "#a1dab4", "#41b6c4", "#2c7fb8", "#253494")
    val YL_GN_BU_6 = arrayOf("#ffffcc", "#c7e9b4", "#7fcdbb", "#41b6c4", "#2c7fb8", "#253494")
    val YL_GN_BU_7 = arrayOf("#ffffcc", "#c7e9b4", "#7fcdbb", "#41b6c4", "#1d91c0", "#225ea8", "#0c2c84")
    val YL_GN_BU_8 = arrayOf("#ffffd9", "#edf8b1", "#c7e9b4", "#7fcdbb", "#41b6c4", "#1d91c0", "#225ea8", "#0c2c84")
    val YL_GN_BU_9 = arrayOf("#ffffd9", "#edf8b1", "#c7e9b4", "#7fcdbb", "#41b6c4", "#1d91c0", "#225ea8", "#253494", "#081d58")
    // yellow - orange - brown
    val YL_OR_BR_3 = arrayOf("#fff7bc", "#fec44f", "#d95f0e")
    val YL_OR_BR_4 = arrayOf("#ffffd4", "#fed98e", "#fe9929", "#cc4c02")
    val YL_OR_BR_5 = arrayOf("#ffffd4", "#fed98e", "#fe9929", "#d95f0e", "#993404")
    val YL_OR_BR_6 = arrayOf("#ffffd4", "#fee391", "#fec44f", "#fe9929", "#d95f0e", "#993404")
    val YL_OR_BR_7 = arrayOf("#ffffd4", "#fee391", "#fec44f", "#fe9929", "#ec7014", "#cc4c02", "#8c2d04")
    val YL_OR_BR_8 = arrayOf("#ffffe5", "#fff7bc", "#fee391", "#fec44f", "#fe9929", "#ec7014", "#cc4c02", "#8c2d04")
    val YL_OR_BR_9 = arrayOf("#ffffe5", "#fff7bc", "#fee391", "#fec44f", "#fe9929", "#ec7014", "#cc4c02", "#993404", "#662506")
    // yellow - orange - red
    val YL_OR_RD_3 = arrayOf("#ffeda0", "#feb24c", "#f03b20")
    val YL_OR_RD_4 = arrayOf("#ffffb2", "#fecc5c", "#fd8d3c", "#e31a1c")
    val YL_OR_RD_5 = arrayOf("#ffffb2", "#fecc5c", "#fd8d3c", "#f03b20", "#bd0026")
    val YL_OR_RD_6 = arrayOf("#ffffb2", "#fed976", "#feb24c", "#fd8d3c", "#f03b20", "#bd0026")
    val YL_OR_RD_7 = arrayOf("#ffffb2", "#fed976", "#feb24c", "#fd8d3c", "#fc4e2a", "#e31a1c", "#b10026")
    val YL_OR_RD_8 = arrayOf("#ffffcc", "#ffeda0", "#fed976", "#feb24c", "#fd8d3c", "#fc4e2a", "#e31a1c", "#b10026")
    val YL_OR_RD_9 = arrayOf("#ffffcc", "#ffeda0", "#fed976", "#feb24c", "#fd8d3c", "#fc4e2a", "#e31a1c", "#bd0026", "#800026")


    val BU_GN = arrayOf(
        BU_GN_3,
        BU_GN_4,
        BU_GN_5,
        BU_GN_6,
        BU_GN_7,
        BU_GN_8,
        BU_GN_9
    )
    val BU_PU = arrayOf(
        BU_PU_3,
        BU_PU_4,
        BU_PU_5,
        BU_PU_6,
        BU_PU_7,
        BU_PU_8,
        BU_PU_9
    )
    val GN_BU = arrayOf(
        GN_BU_3,
        GN_BU_4,
        GN_BU_5,
        GN_BU_6,
        GN_BU_7,
        GN_BU_8,
        GN_BU_9
    )
    val OR_RD = arrayOf(
        OR_RD_3,
        OR_RD_4,
        OR_RD_5,
        OR_RD_6,
        OR_RD_7,
        OR_RD_8,
        OR_RD_9
    )
    val PU_BU = arrayOf(
        PU_BU_3,
        PU_BU_4,
        PU_BU_5,
        PU_BU_6,
        PU_BU_7,
        PU_BU_8,
        PU_BU_9
    )
    val PU_BU_GN = arrayOf(
        PU_BU_GN_3,
        PU_BU_GN_4,
        PU_BU_GN_5,
        PU_BU_GN_6,
        PU_BU_GN_7,
        PU_BU_GN_8,
        PU_BU_GN_9
    )
    val PU_RD = arrayOf(
        PU_RD_3,
        PU_RD_4,
        PU_RD_5,
        PU_RD_6,
        PU_RD_7,
        PU_RD_8,
        PU_RD_9
    )
    val RD_PU = arrayOf(
        RD_PU_3,
        RD_PU_4,
        RD_PU_5,
        RD_PU_6,
        RD_PU_7,
        RD_PU_8,
        RD_PU_9
    )
    val YL_GN = arrayOf(
        YL_GN_3,
        YL_GN_4,
        YL_GN_5,
        YL_GN_6,
        YL_GN_7,
        YL_GN_8,
        YL_GN_9
    )
    val YL_GN_BU = arrayOf(
        YL_GN_BU_3,
        YL_GN_BU_4,
        YL_GN_BU_5,
        YL_GN_BU_6,
        YL_GN_BU_7,
        YL_GN_BU_8,
        YL_GN_BU_9
    )
    val YL_OR_BR = arrayOf(
        YL_OR_BR_3,
        YL_OR_BR_4,
        YL_OR_BR_5,
        YL_OR_BR_6,
        YL_OR_BR_7,
        YL_OR_BR_8,
        YL_OR_BR_9
    )
    val YL_OR_RD = arrayOf(
        YL_OR_RD_3,
        YL_OR_RD_4,
        YL_OR_RD_5,
        YL_OR_RD_6,
        YL_OR_RD_7,
        YL_OR_RD_8,
        YL_OR_RD_9
    )

    // --------------------
    // sequential single-hue
    // --------------------
    // Blues
    val BLUES_3 = arrayOf("#deebf7", "#9ecae1", "#3182bd")
    val BLUES_4 = arrayOf("#eff3ff", "#bdd7e7", "#6baed6", "#2171b5")
    val BLUES_5 = arrayOf("#eff3ff", "#bdd7e7", "#6baed6", "#3182bd", "#08519c")
    val BLUES_6 = arrayOf("#eff3ff", "#c6dbef", "#9ecae1", "#6baed6", "#3182bd", "#08519c")
    val BLUES_7 = arrayOf("#eff3ff", "#c6dbef", "#9ecae1", "#6baed6", "#4292c6", "#2171b5", "#084594")
    val BLUES_8 = arrayOf("#f7fbff", "#deebf7", "#c6dbef", "#9ecae1", "#6baed6", "#4292c6", "#2171b5", "#084594")
    val BLUES_9 = arrayOf("#f7fbff", "#deebf7", "#c6dbef", "#9ecae1", "#6baed6", "#4292c6", "#2171b5", "#08519c", "#08306b")
    // Greens
    val GREENS_3 = arrayOf("#e5f5e0", "#a1d99b", "#31a354")
    val GREENS_4 = arrayOf("#edf8e9", "#bae4b3", "#74c476", "#238b45")
    val GREENS_5 = arrayOf("#edf8e9", "#bae4b3", "#74c476", "#31a354", "#006d2c")
    val GREENS_6 = arrayOf("#edf8e9", "#c7e9c0", "#a1d99b", "#74c476", "#31a354", "#006d2c")
    val GREENS_7 = arrayOf("#edf8e9", "#c7e9c0", "#a1d99b", "#74c476", "#41ab5d", "#238b45", "#005a32")
    val GREENS_8 = arrayOf("#f7fcf5", "#e5f5e0", "#c7e9c0", "#a1d99b", "#74c476", "#41ab5d", "#238b45", "#005a32")
    val GREENS_9 = arrayOf("#f7fcf5", "#e5f5e0", "#c7e9c0", "#a1d99b", "#74c476", "#41ab5d", "#238b45", "#006d2c", "#00441b")
    // Greys
    val GREYS_3 = arrayOf("#f0f0f0", "#bdbdbd", "#636363")
    val GREYS_4 = arrayOf("#f7f7f7", "#cccccc", "#969696", "#525252")
    val GREYS_5 = arrayOf("#f7f7f7", "#cccccc", "#969696", "#636363", "#252525")
    val GREYS_6 = arrayOf("#f7f7f7", "#d9d9d9", "#bdbdbd", "#969696", "#636363", "#252525")
    val GREYS_7 = arrayOf("#f7f7f7", "#d9d9d9", "#bdbdbd", "#969696", "#737373", "#525252", "#252525")
    val GREYS_8 = arrayOf("#ffffff", "#f0f0f0", "#d9d9d9", "#bdbdbd", "#969696", "#737373", "#525252", "#252525")
    val GREYS_9 = arrayOf("#ffffff", "#f0f0f0", "#d9d9d9", "#bdbdbd", "#969696", "#737373", "#525252", "#252525", "#000000")
    // Oranges
    val ORANGES_3 = arrayOf("#fee6ce", "#fdae6b", "#e6550d")
    val ORANGES_4 = arrayOf("#feedde", "#fdbe85", "#fd8d3c", "#d94701")
    val ORANGES_5 = arrayOf("#feedde", "#fdbe85", "#fd8d3c", "#e6550d", "#a63603")
    val ORANGES_6 = arrayOf("#feedde", "#fdd0a2", "#fdae6b", "#fd8d3c", "#e6550d", "#a63603")
    val ORANGES_7 = arrayOf("#feedde", "#fdd0a2", "#fdae6b", "#fd8d3c", "#f16913", "#d94801", "#8c2d04")
    val ORANGES_8 = arrayOf("#fff5eb", "#fee6ce", "#fdd0a2", "#fdae6b", "#fd8d3c", "#f16913", "#d94801", "#8c2d04")
    val ORANGES_9 = arrayOf("#fff5eb", "#fee6ce", "#fdd0a2", "#fdae6b", "#fd8d3c", "#f16913", "#d94801", "#a63603", "#7f2704")
    // Purples
    val PURPLES_3 = arrayOf("#efedf5", "#bcbddc", "#756bb1")
    val PURPLES_4 = arrayOf("#f2f0f7", "#cbc9e2", "#9e9ac8", "#6a51a3")
    val PURPLES_5 = arrayOf("#f2f0f7", "#cbc9e2", "#9e9ac8", "#756bb1", "#54278f")
    val PURPLES_6 = arrayOf("#f2f0f7", "#dadaeb", "#bcbddc", "#9e9ac8", "#756bb1", "#54278f")
    val PURPLES_7 = arrayOf("#f2f0f7", "#dadaeb", "#bcbddc", "#9e9ac8", "#807dba", "#6a51a3", "#4a1486")
    val PURPLES_8 = arrayOf("#fcfbfd", "#efedf5", "#dadaeb", "#bcbddc", "#9e9ac8", "#807dba", "#6a51a3", "#4a1486")
    val PURPLES_9 = arrayOf("#fcfbfd", "#efedf5", "#dadaeb", "#bcbddc", "#9e9ac8", "#807dba", "#6a51a3", "#54278f", "#3f007d")
    // Reds
    val REDS_3 = arrayOf("#fee0d2", "#fc9272", "#de2d26")
    val REDS_4 = arrayOf("#fee5d9", "#fcae91", "#fb6a4a", "#cb181d")
    val REDS_5 = arrayOf("#fee5d9", "#fcae91", "#fb6a4a", "#de2d26", "#a50f15")
    val REDS_6 = arrayOf("#fee5d9", "#fcbba1", "#fc9272", "#fb6a4a", "#de2d26", "#a50f15")
    val REDS_7 = arrayOf("#fee5d9", "#fcbba1", "#fc9272", "#fb6a4a", "#ef3b2c", "#cb181d", "#99000d")
    val REDS_8 = arrayOf("#fff5f0", "#fee0d2", "#fcbba1", "#fc9272", "#fb6a4a", "#ef3b2c", "#cb181d", "#99000d")
    val REDS_9 = arrayOf("#fff5f0", "#fee0d2", "#fcbba1", "#fc9272", "#fb6a4a", "#ef3b2c", "#cb181d", "#a50f15", "#67000d")

    // single-hue
    val BLUES = arrayOf(
        BLUES_3,
        BLUES_4,
        BLUES_5,
        BLUES_6,
        BLUES_7,
        BLUES_8,
        BLUES_9
    )
    val GREENS = arrayOf(
        GREENS_3,
        GREENS_4,
        GREENS_5,
        GREENS_6,
        GREENS_7,
        GREENS_8,
        GREENS_9
    )
    val GREYS = arrayOf(
        GREYS_3,
        GREYS_4,
        GREYS_5,
        GREYS_6,
        GREYS_7,
        GREYS_8,
        GREYS_9
    )
    val ORANGES = arrayOf(
        ORANGES_3,
        ORANGES_4,
        ORANGES_5,
        ORANGES_6,
        ORANGES_7,
        ORANGES_8,
        ORANGES_9
    )
    val PURPLES = arrayOf(
        PURPLES_3,
        PURPLES_4,
        PURPLES_5,
        PURPLES_6,
        PURPLES_7,
        PURPLES_8,
        PURPLES_9
    )
    val REDS = arrayOf(
        REDS_3,
        REDS_4,
        REDS_5,
        REDS_6,
        REDS_7,
        REDS_8,
        REDS_9
    )


    // --------------------
    // diverging
    // --------------------
    // brown - blueGreen
    val BR_BG_3 = arrayOf("#d8b365", "#f5f5f5", "#5ab4ac")
    val BR_BG_4 = arrayOf("#a6611a", "#dfc27d", "#80cdc1", "#018571")
    val BR_BG_5 = arrayOf("#a6611a", "#dfc27d", "#f5f5f5", "#80cdc1", "#018571")
    val BR_BG_6 = arrayOf("#8c510a", "#d8b365", "#f6e8c3", "#c7eae5", "#5ab4ac", "#01665e")
    val BR_BG_7 = arrayOf("#8c510a", "#d8b365", "#f6e8c3", "#f5f5f5", "#c7eae5", "#5ab4ac", "#01665e")
    val BR_BG_8 = arrayOf("#8c510a", "#bf812d", "#dfc27d", "#f6e8c3", "#c7eae5", "#80cdc1", "#35978f", "#01665e")
    val BR_BG_9 = arrayOf("#8c510a", "#bf812d", "#dfc27d", "#f6e8c3", "#f5f5f5", "#c7eae5", "#80cdc1", "#35978f", "#01665e")
    val BR_BG_10 = arrayOf("#543005", "#8c510a", "#bf812d", "#dfc27d", "#f6e8c3", "#c7eae5", "#80cdc1", "#35978f", "#01665e", "#003c30")
    val BR_BG_11 = arrayOf("#543005", "#8c510a", "#bf812d", "#dfc27d", "#f6e8c3", "#f5f5f5", "#c7eae5", "#80cdc1", "#35978f", "#01665e", "#003c30")
    // pink - yellowGreen
    val PI_YG_3 = arrayOf("#e9a3c9", "#f7f7f7", "#a1d76a")
    val PI_YG_4 = arrayOf("#d01c8b", "#f1b6da", "#b8e186", "#4dac26")
    val PI_YG_5 = arrayOf("#d01c8b", "#f1b6da", "#f7f7f7", "#b8e186", "#4dac26")
    val PI_YG_6 = arrayOf("#c51b7d", "#e9a3c9", "#fde0ef", "#e6f5d0", "#a1d76a", "#4d9221")
    val PI_YG_7 = arrayOf("#c51b7d", "#e9a3c9", "#fde0ef", "#f7f7f7", "#e6f5d0", "#a1d76a", "#4d9221")
    val PI_YG_8 = arrayOf("#c51b7d", "#de77ae", "#f1b6da", "#fde0ef", "#e6f5d0", "#b8e186", "#7fbc41", "#4d9221")
    val PI_YG_9 = arrayOf("#c51b7d", "#de77ae", "#f1b6da", "#fde0ef", "#f7f7f7", "#e6f5d0", "#b8e186", "#7fbc41", "#4d9221")
    val PI_YG_10 = arrayOf("#8e0152", "#c51b7d", "#de77ae", "#f1b6da", "#fde0ef", "#e6f5d0", "#b8e186", "#7fbc41", "#4d9221", "#276419")
    val PI_YG_11 = arrayOf("#8e0152", "#c51b7d", "#de77ae", "#f1b6da", "#fde0ef", "#f7f7f7", "#e6f5d0", "#b8e186", "#7fbc41", "#4d9221", "#276419")
    // purpleRed - green
    val PR_GN_3 = arrayOf("#af8dc3", "#f7f7f7", "#7fbf7b")
    val PR_GN_4 = arrayOf("#7b3294", "#c2a5cf", "#a6dba0", "#008837")
    val PR_GN_5 = arrayOf("#7b3294", "#c2a5cf", "#f7f7f7", "#a6dba0", "#008837")
    val PR_GN_6 = arrayOf("#762a83", "#af8dc3", "#e7d4e8", "#d9f0d3", "#7fbf7b", "#1b7837")
    val PR_GN_7 = arrayOf("#762a83", "#af8dc3", "#e7d4e8", "#f7f7f7", "#d9f0d3", "#7fbf7b", "#1b7837")
    val PR_GN_8 = arrayOf("#762a83", "#9970ab", "#c2a5cf", "#e7d4e8", "#d9f0d3", "#a6dba0", "#5aae61", "#1b7837")
    val PR_GN_9 = arrayOf("#762a83", "#9970ab", "#c2a5cf", "#e7d4e8", "#f7f7f7", "#d9f0d3", "#a6dba0", "#5aae61", "#1b7837")
    val PR_GN_10 = arrayOf("#40004b", "#762a83", "#9970ab", "#c2a5cf", "#e7d4e8", "#d9f0d3", "#a6dba0", "#5aae61", "#1b7837", "#00441b")
    val PR_GN_11 = arrayOf("#40004b", "#762a83", "#9970ab", "#c2a5cf", "#e7d4e8", "#f7f7f7", "#d9f0d3", "#a6dba0", "#5aae61", "#1b7837", "#00441b")
    // purple - orange
    val PU_OR_3 = arrayOf("#f1a340", "#f7f7f7", "#998ec3")
    val PU_OR_4 = arrayOf("#e66101", "#fdb863", "#b2abd2", "#5e3c99")
    val PU_OR_5 = arrayOf("#e66101", "#fdb863", "#f7f7f7", "#b2abd2", "#5e3c99")
    val PU_OR_6 = arrayOf("#b35806", "#f1a340", "#fee0b6", "#d8daeb", "#998ec3", "#542788")
    val PU_OR_7 = arrayOf("#b35806", "#f1a340", "#fee0b6", "#f7f7f7", "#d8daeb", "#998ec3", "#542788")
    val PU_OR_8 = arrayOf("#b35806", "#e08214", "#fdb863", "#fee0b6", "#d8daeb", "#b2abd2", "#8073ac", "#542788")
    val PU_OR_9 = arrayOf("#b35806", "#e08214", "#fdb863", "#fee0b6", "#f7f7f7", "#d8daeb", "#b2abd2", "#8073ac", "#542788")
    val PU_OR_10 = arrayOf("#7f3b08", "#b35806", "#e08214", "#fdb863", "#fee0b6", "#d8daeb", "#b2abd2", "#8073ac", "#542788", "#2d004b")
    val PU_OR_11 = arrayOf("#7f3b08", "#b35806", "#e08214", "#fdb863", "#fee0b6", "#f7f7f7", "#d8daeb", "#b2abd2", "#8073ac", "#542788", "#2d004b")
    // red - blue
    val RD_BU_3 = arrayOf("#ef8a62", "#f7f7f7", "#67a9cf")
    val RD_BU_4 = arrayOf("#ca0020", "#f4a582", "#92c5de", "#0571b0")
    val RD_BU_5 = arrayOf("#ca0020", "#f4a582", "#f7f7f7", "#92c5de", "#0571b0")
    val RD_BU_6 = arrayOf("#b2182b", "#ef8a62", "#fddbc7", "#d1e5f0", "#67a9cf", "#2166ac")
    val RD_BU_7 = arrayOf("#b2182b", "#ef8a62", "#fddbc7", "#f7f7f7", "#d1e5f0", "#67a9cf", "#2166ac")
    val RD_BU_8 = arrayOf("#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#d1e5f0", "#92c5de", "#4393c3", "#2166ac")
    val RD_BU_9 = arrayOf("#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#f7f7f7", "#d1e5f0", "#92c5de", "#4393c3", "#2166ac")
    val RD_BU_10 = arrayOf("#67001f", "#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#d1e5f0", "#92c5de", "#4393c3", "#2166ac", "#053061")
    val RD_BU_11 = arrayOf("#67001f", "#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#f7f7f7", "#d1e5f0", "#92c5de", "#4393c3", "#2166ac", "#053061")
    // red - grey
    val RD_GY_3 = arrayOf("#ef8a62", "#ffffff", "#999999")
    val RD_GY_4 = arrayOf("#ca0020", "#f4a582", "#bababa", "#404040")
    val RD_GY_5 = arrayOf("#ca0020", "#f4a582", "#ffffff", "#bababa", "#404040")
    val RD_GY_6 = arrayOf("#b2182b", "#ef8a62", "#fddbc7", "#e0e0e0", "#999999", "#4d4d4d")
    val RD_GY_7 = arrayOf("#b2182b", "#ef8a62", "#fddbc7", "#ffffff", "#e0e0e0", "#999999", "#4d4d4d")
    val RD_GY_8 = arrayOf("#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#e0e0e0", "#bababa", "#878787", "#4d4d4d")
    val RD_GY_9 = arrayOf("#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#ffffff", "#e0e0e0", "#bababa", "#878787", "#4d4d4d")
    val RD_GY_10 = arrayOf("#67001f", "#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#e0e0e0", "#bababa", "#878787", "#4d4d4d", "#1a1a1a")
    val RD_GY_11 = arrayOf("#67001f", "#b2182b", "#d6604d", "#f4a582", "#fddbc7", "#ffffff", "#e0e0e0", "#bababa", "#878787", "#4d4d4d", "#1a1a1a")
    // red - yellow - blue
    val RD_YL_BU_3 = arrayOf("#fc8d59", "#ffffbf", "#91bfdb")
    val RD_YL_BU_4 = arrayOf("#d7191c", "#fdae61", "#abd9e9", "#2c7bb6")
    val RD_YL_BU_5 = arrayOf("#d7191c", "#fdae61", "#ffffbf", "#abd9e9", "#2c7bb6")
    val RD_YL_BU_6 = arrayOf("#d73027", "#fc8d59", "#fee090", "#e0f3f8", "#91bfdb", "#4575b4")
    val RD_YL_BU_7 = arrayOf("#d73027", "#fc8d59", "#fee090", "#ffffbf", "#e0f3f8", "#91bfdb", "#4575b4")
    val RD_YL_BU_8 = arrayOf("#d73027", "#f46d43", "#fdae61", "#fee090", "#e0f3f8", "#abd9e9", "#74add1", "#4575b4")
    val RD_YL_BU_9 = arrayOf("#d73027", "#f46d43", "#fdae61", "#fee090", "#ffffbf", "#e0f3f8", "#abd9e9", "#74add1", "#4575b4")
    val RD_YL_BU_10 = arrayOf("#a50026", "#d73027", "#f46d43", "#fdae61", "#fee090", "#e0f3f8", "#abd9e9", "#74add1", "#4575b4", "#313695")
    val RD_YL_BU_11 = arrayOf("#a50026", "#d73027", "#f46d43", "#fdae61", "#fee090", "#ffffbf", "#e0f3f8", "#abd9e9", "#74add1", "#4575b4", "#313695")
    // red - yellow - green
    val RD_YL_GN_3 = arrayOf("#fc8d59", "#ffffbf", "#91cf60")
    val RD_YL_GN_4 = arrayOf("#d7191c", "#fdae61", "#a6d96a", "#1a9641")
    val RD_YL_GN_5 = arrayOf("#d7191c", "#fdae61", "#ffffbf", "#a6d96a", "#1a9641")
    val RD_YL_GN_6 = arrayOf("#d73027", "#fc8d59", "#fee08b", "#d9ef8b", "#91cf60", "#1a9850")
    val RD_YL_GN_7 = arrayOf("#d73027", "#fc8d59", "#fee08b", "#ffffbf", "#d9ef8b", "#91cf60", "#1a9850")
    val RD_YL_GN_8 = arrayOf("#d73027", "#f46d43", "#fdae61", "#fee08b", "#d9ef8b", "#a6d96a", "#66bd63", "#1a9850")
    val RD_YL_GN_9 = arrayOf("#d73027", "#f46d43", "#fdae61", "#fee08b", "#ffffbf", "#d9ef8b", "#a6d96a", "#66bd63", "#1a9850")
    val RD_YL_GN_10 = arrayOf("#a50026", "#d73027", "#f46d43", "#fdae61", "#fee08b", "#d9ef8b", "#a6d96a", "#66bd63", "#1a9850", "#006837")
    val RD_YL_GN_11 = arrayOf("#a50026", "#d73027", "#f46d43", "#fdae61", "#fee08b", "#ffffbf", "#d9ef8b", "#a6d96a", "#66bd63", "#1a9850", "#006837")
    // Spectral
    val SPECTRAL_3 = arrayOf("#fc8d59", "#ffffbf", "#99d594")
    val SPECTRAL_4 = arrayOf("#d7191c", "#fdae61", "#abdda4", "#2b83ba")
    val SPECTRAL_5 = arrayOf("#d7191c", "#fdae61", "#ffffbf", "#abdda4", "#2b83ba")
    val SPECTRAL_6 = arrayOf("#d53e4f", "#fc8d59", "#fee08b", "#e6f598", "#99d594", "#3288bd")
    val SPECTRAL_7 = arrayOf("#d53e4f", "#fc8d59", "#fee08b", "#ffffbf", "#e6f598", "#99d594", "#3288bd")
    val SPECTRAL_8 = arrayOf("#d53e4f", "#f46d43", "#fdae61", "#fee08b", "#e6f598", "#abdda4", "#66c2a5", "#3288bd")
    val SPECTRAL_9 = arrayOf("#d53e4f", "#f46d43", "#fdae61", "#fee08b", "#ffffbf", "#e6f598", "#abdda4", "#66c2a5", "#3288bd")
    val SPECTRAL_10 = arrayOf("#9e0142", "#d53e4f", "#f46d43", "#fdae61", "#fee08b", "#e6f598", "#abdda4", "#66c2a5", "#3288bd", "#5e4fa2")
    val SPECTRAL_11 = arrayOf("#9e0142", "#d53e4f", "#f46d43", "#fdae61", "#fee08b", "#ffffbf", "#e6f598", "#abdda4", "#66c2a5", "#3288bd", "#5e4fa2")

    val BR_BG = arrayOf(
        BR_BG_3,
        BR_BG_4,
        BR_BG_5,
        BR_BG_6,
        BR_BG_7,
        BR_BG_8,
        BR_BG_9,
        BR_BG_10,
        BR_BG_11
    )
    val PI_YG = arrayOf(
        PI_YG_3,
        PI_YG_4,
        PI_YG_5,
        PI_YG_6,
        PI_YG_7,
        PI_YG_8,
        PI_YG_9,
        PI_YG_10,
        PI_YG_11
    )
    val PR_GN = arrayOf(
        PR_GN_3,
        PR_GN_4,
        PR_GN_5,
        PR_GN_6,
        PR_GN_7,
        PR_GN_8,
        PR_GN_9,
        PR_GN_10,
        PR_GN_11
    )
    val PU_OR = arrayOf(
        PU_OR_3,
        PU_OR_4,
        PU_OR_5,
        PU_OR_6,
        PU_OR_7,
        PU_OR_8,
        PU_OR_9,
        PU_OR_10,
        PU_OR_11
    )
    val RD_BU = arrayOf(
        RD_BU_3,
        RD_BU_4,
        RD_BU_5,
        RD_BU_6,
        RD_BU_7,
        RD_BU_8,
        RD_BU_9,
        RD_BU_10,
        RD_BU_11
    )
    val RD_GY = arrayOf(
        RD_GY_3,
        RD_GY_4,
        RD_GY_5,
        RD_GY_6,
        RD_GY_7,
        RD_GY_8,
        RD_GY_9,
        RD_GY_10,
        RD_GY_11
    )
    val RD_YL_BU = arrayOf(
        RD_YL_BU_3,
        RD_YL_BU_4,
        RD_YL_BU_5,
        RD_YL_BU_6,
        RD_YL_BU_7,
        RD_YL_BU_8,
        RD_YL_BU_9,
        RD_YL_BU_10,
        RD_YL_BU_11
    )
    val RD_YL_GN = arrayOf(
        RD_YL_GN_3,
        RD_YL_GN_4,
        RD_YL_GN_5,
        RD_YL_GN_6,
        RD_YL_GN_7,
        RD_YL_GN_8,
        RD_YL_GN_9,
        RD_YL_GN_10,
        RD_YL_GN_11
    )
    val SPECTRAL = arrayOf(
        SPECTRAL_3,
        SPECTRAL_4,
        SPECTRAL_5,
        SPECTRAL_6,
        SPECTRAL_7,
        SPECTRAL_8,
        SPECTRAL_9,
        SPECTRAL_10,
        SPECTRAL_11
    )


    // ------------------------------
    // qualitative
    // ------------------------------
    // Accent
    val ACCENT_3 = arrayOf("#7fc97f", "#beaed4", "#fdc086")
    val ACCENT_4 = arrayOf("#7fc97f", "#beaed4", "#fdc086", "#ffff99")
    val ACCENT_5 = arrayOf("#7fc97f", "#beaed4", "#fdc086", "#ffff99", "#386cb0")
    val ACCENT_6 = arrayOf("#7fc97f", "#beaed4", "#fdc086", "#ffff99", "#386cb0", "#f0027f")
    val ACCENT_7 = arrayOf("#7fc97f", "#beaed4", "#fdc086", "#ffff99", "#386cb0", "#f0027f", "#bf5b17")
    val ACCENT_8 = arrayOf("#7fc97f", "#beaed4", "#fdc086", "#ffff99", "#386cb0", "#f0027f", "#bf5b17", "#666666")
    // Dark2
    val DARK_2_3 = arrayOf("#1b9e77", "#d95f02", "#7570b3")
    val DARK_2_4 = arrayOf("#1b9e77", "#d95f02", "#7570b3", "#e7298a")
    val DARK_2_5 = arrayOf("#1b9e77", "#d95f02", "#7570b3", "#e7298a", "#66a61e")
    val DARK_2_6 = arrayOf("#1b9e77", "#d95f02", "#7570b3", "#e7298a", "#66a61e", "#e6ab02")
    val DARK_2_7 = arrayOf("#1b9e77", "#d95f02", "#7570b3", "#e7298a", "#66a61e", "#e6ab02", "#a6761d")
    val DARK_2_8 = arrayOf("#1b9e77", "#d95f02", "#7570b3", "#e7298a", "#66a61e", "#e6ab02", "#a6761d", "#666666")
    // Paired
    val PAIRED_3 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a")
    val PAIRED_4 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c")
    val PAIRED_5 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99")
    val PAIRED_6 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c")
    val PAIRED_7 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f")
    val PAIRED_8 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f", "#ff7f00")
    val PAIRED_9 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f", "#ff7f00", "#cab2d6")
    val PAIRED_10 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f", "#ff7f00", "#cab2d6", "#6a3d9a")
    val PAIRED_11 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f", "#ff7f00", "#cab2d6", "#6a3d9a", "#ffff99")
    val PAIRED_12 = arrayOf("#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c", "#fdbf6f", "#ff7f00", "#cab2d6", "#6a3d9a", "#ffff99", "#b15928")
    // Pastel1
    val PASTEL_1_3 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5")
    val PASTEL_1_4 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4")
    val PASTEL_1_5 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4", "#fed9a6")
    val PASTEL_1_6 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4", "#fed9a6", "#ffffcc")
    val PASTEL_1_7 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4", "#fed9a6", "#ffffcc", "#e5d8bd")
    val PASTEL_1_8 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4", "#fed9a6", "#ffffcc", "#e5d8bd", "#fddaec")
    val PASTEL_1_9 = arrayOf("#fbb4ae", "#b3cde3", "#ccebc5", "#decbe4", "#fed9a6", "#ffffcc", "#e5d8bd", "#fddaec", "#f2f2f2")
    // Pastel2
    val PASTEL_2_3 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8")
    val PASTEL_2_4 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8", "#f4cae4")
    val PASTEL_2_5 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8", "#f4cae4", "#e6f5c9")
    val PASTEL_2_6 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8", "#f4cae4", "#e6f5c9", "#fff2ae")
    val PASTEL_2_7 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8", "#f4cae4", "#e6f5c9", "#fff2ae", "#f1e2cc")
    val PASTEL_2_8 = arrayOf("#b3e2cd", "#fdcdac", "#cbd5e8", "#f4cae4", "#e6f5c9", "#fff2ae", "#f1e2cc", "#cccccc")
    // Set1
    val SET_1_3 = arrayOf("#e41a1c", "#377eb8", "#4daf4a")
    val SET_1_4 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3")
    val SET_1_5 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3", "#ff7f00")
    val SET_1_6 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3", "#ff7f00", "#ffff33")
    val SET_1_7 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3", "#ff7f00", "#ffff33", "#a65628")
    val SET_1_8 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3", "#ff7f00", "#ffff33", "#a65628", "#f781bf")
    val SET_1_9 = arrayOf("#e41a1c", "#377eb8", "#4daf4a", "#984ea3", "#ff7f00", "#ffff33", "#a65628", "#f781bf", "#999999")
    // Set2
    val SET_2_3 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb")
    val SET_2_4 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3")
    val SET_2_5 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854")
    val SET_2_6 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854", "#ffd92f")
    val SET_2_7 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854", "#ffd92f", "#e5c494")
    val SET_2_8 = arrayOf("#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854", "#ffd92f", "#e5c494", "#b3b3b3")
    // Set3
    val SET_3_3 = arrayOf("#8dd3c7", "#ffffb3", "#bebada")
    val SET_3_4 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072")
    val SET_3_5 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3")
    val SET_3_6 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462")
    val SET_3_7 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69")
    val SET_3_8 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69", "#fccde5")
    val SET_3_9 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69", "#fccde5", "#d9d9d9")
    val SET_3_10 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69", "#fccde5", "#d9d9d9", "#bc80bd")
    val SET_3_11 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69", "#fccde5", "#d9d9d9", "#bc80bd", "#ccebc5")
    val SET_3_12 = arrayOf("#8dd3c7", "#ffffb3", "#bebada", "#fb8072", "#80b1d3", "#fdb462", "#b3de69", "#fccde5", "#d9d9d9", "#bc80bd", "#ccebc5", "#ffed6f")

    val ACCENT = arrayOf(
        ACCENT_3,
        ACCENT_4,
        ACCENT_5,
        ACCENT_6,
        ACCENT_7,
        ACCENT_8
    )
    val DARK_2 = arrayOf(
        DARK_2_3,
        DARK_2_4,
        DARK_2_5,
        DARK_2_6,
        DARK_2_7,
        DARK_2_8
    )
    val PAIRED = arrayOf(
        PAIRED_3,
        PAIRED_4,
        PAIRED_5,
        PAIRED_6,
        PAIRED_7,
        PAIRED_8,
        PAIRED_9,
        PAIRED_10,
        PAIRED_11,
        PAIRED_12
    )
    val PASTEL_1 = arrayOf(
        PASTEL_1_3,
        PASTEL_1_4,
        PASTEL_1_5,
        PASTEL_1_6,
        PASTEL_1_7,
        PASTEL_1_8,
        PASTEL_1_9
    )
    val PASTEL_2 = arrayOf(
        PASTEL_2_3,
        PASTEL_2_4,
        PASTEL_2_5,
        PASTEL_2_6,
        PASTEL_2_7,
        PASTEL_2_8
    )
    val SET_1 = arrayOf(
        SET_1_3,
        SET_1_4,
        SET_1_5,
        SET_1_6,
        SET_1_7,
        SET_1_8,
        SET_1_9
    )
    val SET_2 = arrayOf(
        SET_2_3,
        SET_2_4,
        SET_2_5,
        SET_2_6,
        SET_2_7,
        SET_2_8
    )
    val SET_3 = arrayOf(
        SET_3_3,
        SET_3_4,
        SET_3_5,
        SET_3_6,
        SET_3_7,
        SET_3_8,
        SET_3_9,
        SET_3_10,
        SET_3_11,
        SET_3_12
    )
}
