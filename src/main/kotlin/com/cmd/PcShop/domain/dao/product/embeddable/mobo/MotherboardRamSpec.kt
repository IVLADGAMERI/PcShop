package com.cmd.PcShop.domain.dao.product.embeddable.mobo

import com.cmd.PcShop.domain.type.MotherboardRamType
import com.cmd.PcShop.domain.type.RamChannelMode
import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardRamSpec (
    @Column(name = "ram_type", nullable = false)
    var ramType: MotherboardRamType,
    @Column(name = "max_ram_clock_in_MGHz", nullable = false)
    var maxRamClockInMGHz: Int,
    @Column(name = "ram_number", nullable = false)
    var ramNumber: Int,
    @Column(name = "max_ram_volume_in_gb", nullable = false)
    var maxRamVolumeInGb: Int,
    @Column(name = "ram_channel_mode", nullable = false)
    var ramChannelMode: RamChannelMode,
    @Column(name = "ram_additional_info", length = 512)
    var ramAdditionalInfo: String?,
)