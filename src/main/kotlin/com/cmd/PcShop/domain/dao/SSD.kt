package com.cmd.PcShop.domain.dao

import com.cmd.PcShop.domain.type.SSDFormFactor
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity(name = "SSD")
data class SSD (
    @Column(name = "volume_in_gb", nullable = false)
    var volumeInGb : UShort,
    @Column(name = "form_factor", nullable = false)
    var formFactor: SSDFormFactor,

) : Product()