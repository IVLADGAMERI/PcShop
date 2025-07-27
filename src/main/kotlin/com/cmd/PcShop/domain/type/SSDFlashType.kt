package com.cmd.PcShop.domain.type

enum class SSDFlashType (
    val value: String
) {
    SLC("SLC"),
    MLC("MLC"),
    TLC("TLC"),
    QLC("QLC"),
    PLC("PLC"),
    TLC_3D("3D TLC"),
    QLC_3D("3D QLC"),
    V_NAND("V-NAND"),
    XPOINT("3D XPoint")
}