package com.cmd.PcShop.domain.dao.product.entity.ssd

import com.cmd.PcShop.domain.dao.product.entity.Product
import com.cmd.PcShop.domain.type.SSDBusStandard
import com.cmd.PcShop.domain.type.SSDFlashType
import com.cmd.PcShop.domain.type.SSDFormFactor
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "SSD")
data class SSD (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: SSDManufacturer,
    @Column(name = "volume_in_gb", nullable = false)
    var volumeInGb: Int,
    @Column(name = "form_factor", nullable = false)
    var formFactor: SSDFormFactor,
    @Column(name = "bus_standard", nullable = false)
    var busStandard: SSDBusStandard,
    @Column(name = "flash_type", nullable = false)
    var flashType: SSDFlashType,
    @Column(nullable = false)
    var controller: String,
    @Column(nullable = false)
    var tbw: Int,
    @Column(name = "dram_volume_in_mb")
    var dramVolumeInMb: Int?,
    @Column(name = "hardware_encryption")
    var hardwareEncryption: String?,
    @Column(name = "sequential_read_speed_in_MBps", nullable = false)
    var sequentialReadSpeedInMBps: Int,
    @Column(name = "sequential_write_speed_in_MBps", nullable = false)
    var sequentialWriteSpeedInMBps: Int,
    @Column(name = "awg_random_read_speed_in_IOps", nullable = false)
    var awgRandomReadSpeedInIOps: Int,
    @Column(name = "awg_random_write_speed_in_IOps", nullable = false)
    var awgRandomWriteSpeedInIOps: Int,
    @Column(name = "mtbf_in_hours", nullable = false)
    var MTBFInHours: Int,
    @Column(name = "thickness_in_mm", nullable = false)
    var thicknessInMm: Float,
    @Column(name = "cooling_type")
    var coolingType: String?,
    @Column(name = "backlight_type")
    var backlightType: String?
) : Product()