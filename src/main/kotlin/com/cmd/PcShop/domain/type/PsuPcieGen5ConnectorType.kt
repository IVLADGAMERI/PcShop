package com.cmd.PcShop.domain.type

enum class PsuPcieGen5ConnectorType(
    val value: String
) {
    NONE("нет"),
    TWELVE_V_HPWR("12VHPWR"),
    TWELVE_V_2X6("12V-2×6"),
    NVIDIA_TWELVE_PIN("12-pin NVIDIA")
}