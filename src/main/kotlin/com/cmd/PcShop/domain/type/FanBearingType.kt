package com.cmd.PcShop.domain.type

enum class FanBearingType (
    val value: String
) {
    FDB("гидродинамический (FDB)"),
    FDBM("гидродинамический (FDB) с магнитным центрированием"),
    SLEEVE("скольжения"),
    RIFLE("скольжения с винтовой нарезкой"),
    BALL("качения"),
    DUAL_BALL("двойной шарикоподшипник"),
    POM("полиоксиметиленовый")
}