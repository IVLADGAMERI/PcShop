package com.cmd.PcShop.domain.type

enum class FanConnectorType (
    val value: String
) {
    THREE_PIN_DC("3-pin (DC)"),
    FOUR_PIN_PWM("4-pin (PWM)"),
    MOLEX("Molex"),
    SATA("SATA Power"),
    USB("USB")
}