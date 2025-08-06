package com.cmd.PcShop.domain.dao.product.embeddable

import com.cmd.PcShop.domain.type.PCIEVersion
import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardPcieSpec (
    @Column(name = "pcie_version", nullable = false)
    var pcieVersion: PCIEVersion,
    @Column(name = "pcie_x16_number", nullable = false)
    var pcieX16Number: Int,
    @Column(name = "pcie_x8_number", nullable = false)
    var pcieX8Number: Int,
    @Column(name = "pcie_x4_number", nullable = false)
    var pcieX4Number: Int,
    @Column(name = "pcie_x1_number", nullable = false)
    var pcieX1Number: Int,
    @Column(name = "pcie_additional_info", length = 512)
    var pcieAdditionalInfo: String?,
)