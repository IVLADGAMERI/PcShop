package com.cmd.PcShop.domain.type

enum class FanBacklightType (
    val value: String
) {
    NONE("нет"),
    STATIC("статичный"),
    ARGB_5V_3PIN("3-pin 5V ARGB"),
    RGB_12V_4PIN("4-pin 12V RGB"),
    OTHER("другой")
}