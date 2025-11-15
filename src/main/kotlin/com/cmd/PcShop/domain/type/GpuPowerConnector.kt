package com.cmd.PcShop.domain.type

enum class GpuPowerConnector (
    val value: String
) {
    SIX("6 pin"),
    SIX_SIX("6+6 pin"),
    SIX_EIGHT("6+8 pin"),
    SIX_EIGHT_EIGHT("6+8+8 pin"),
    EIGHT("8 pin"),
    EIGHT_EIGHT("8+8 pin"),
    EIGHT_EIGHT_EIGHT("8+8+8 pin"),
    SIXTEEN("16 pin (12V 2x6)"),
    SIXTEEN_HPWR("16 pin (12V HPWR)")
}