package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardVrmSpec (
    @Column(name = "vrm_config", length = 16, nullable = false)
    var vrmConfig: String,
    @Column(name = "has_vrm_cooling", nullable = false)
    var hasVrmCooling: Boolean,
)