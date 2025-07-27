package com.cmd.PcShop.domain.dao

import com.cmd.PcShop.domain.type.SSDBusStandard
import com.cmd.PcShop.domain.type.SSDFlashType
import com.cmd.PcShop.domain.type.SSDFormFactor
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity(name = "SSD")
data class SSD (
    @Column(name = "volume_in_gb", nullable = false)
    var volumeInGb: UShort,
    @Column(name = "form_factor", nullable = false)
    var formFactor: SSDFormFactor,
    @Column(name = "bus_standard", nullable = false)
    var busStandard: SSDBusStandard,
    @Column(name = "flash_type", nullable = false)
    var flashType: SSDFlashType,
    @Column(nullable = false)
    var controller: String,
    @Column(nullable = false)
    var tbw: UShort,
    @Column(name = "dram_volume_in_mb")
    var dramVolumeInMb: UShort?,
    @Column(name = "hardware_encryption")
    var hardwareEncryption: String?,
    @Column(name = "sequential_read_speed_in_MBps", nullable = false)
    var sequentialReadSpeedInMBps: UShort,
    @Column(name = "sequential_write_speed_in_MBps", nullable = false)
    var sequentialWriteSpeedInMBps: UShort,
    @Column(name = "awg_random_read_speed_in_IOps", nullable = false)
    var awgRandomReadSpeedInIOps: UInt,
    @Column(name = "awg_random_write_speed_in_IOps", nullable = false)
    var awgRandomWriteSpeedInIOps: UInt,
    @Column(name = "mtbf_in_hours", nullable = false)
    var MTBFInHours: UInt,
    @Column(name = "thickness_in_mm", nullable = false)
    var thicknessInMm: Float,
    @Column(name = "cooling_type")
    var coolingType: String?,
    @Column(name = "backlight_type")
    var backlightType: String?
) : Product()