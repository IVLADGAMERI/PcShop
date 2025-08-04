package com.cmd.PcShop.domain.type

enum class WifiVersion (
    val value: String
) {
    WIFI_4("802.11n (WI-FI 4)"),
    WIFI_5("802.11ac (WI-FI 5)"),
    WIFI_6("802.11ax (WI-FI 6)"),
    WIFI_6E("802.11ax (WI-FI 6E)"),
    WIFI_7("802.11be (WI-FI 7)")
}