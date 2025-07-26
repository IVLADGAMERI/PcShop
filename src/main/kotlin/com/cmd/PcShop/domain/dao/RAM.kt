package com.cmd.PcShop.domain.dao

import com.cmd.PcShop.domain.type.RamType
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "RAM")
data class RAM (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: RamManufacturer,
    @Column(name = "type", nullable = false)
    var type: RamType,
    @Column(nullable = false)
    var clockInMGHz: UShort,
    @Column(name = "volume_in_gb", nullable = false)
    var volumeInGb : UShort,
    @Column(name = "cas_latency", nullable = false)
    var casLatency : UByte,
    @Column(nullable = false)
    var timings : String,
    @Column(nullable = false)
    var voltage : Float,
    @Column(name = "has_xmp_profile", nullable = false)
    var hasXmpProfile : Boolean,
    @Column(name = "has_amd_expo_profile", nullable = false)
    var hasAmdExpoProfile : Boolean,
    @Column(name = "has_radiator", nullable = false)
    var hasRadiator : Boolean,
    @Column(name = "is_low_profile", nullable = false)
    var isLowProfile : Boolean,
    @Column(name = "backlight_color")
    var backlightColor : String?,
    @Column(nullable = false)
    var color : String
) : Product()