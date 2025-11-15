package com.cmd.PcShop.domain.type

enum class GpuInterface(
    val value: String
) {
    PCIE_X8_2_0("PCI Express 2.0 X8"),
    PCIE_X8_3_0("PCI Express 3.0 X8"),
    PCIE_X8_4_0("PCI Express 4.0 X8"),
    PCIE_X8_5_0("PCI Express 5.0 X8"),
    PCIE_X16("PCI Express X16"),
    PCIE_X16_2_0("PCI Express 2.0 X16"),
    PCIE_X16_3_0("PCI Express 3.0 X16"),
    PCIE_X16_4_0("PCI Express 4.0 X16"),
    PCIE_X16_5_0("PCI Express 5.0 X16")
}