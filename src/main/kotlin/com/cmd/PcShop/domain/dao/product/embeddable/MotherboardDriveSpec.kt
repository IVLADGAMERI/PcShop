package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardDriveSpec (
    @Column(name = "m2_number", nullable = false)
    var m2Number: Int,
    @Column(name = "sata_3_number", nullable = false)
    var sata3Number: Int,
    @Column(name = "sata_2_number", nullable = false)
    var sata2Number: Int,
    @Column(name = "raid_info", length = 32)
    var raidInfo: String?,
)