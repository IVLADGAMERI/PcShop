package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class PhysicalSpec(
    @Column(name = "length_in_mm")
    val lengthInMm: Int?,
    @Column(name = "width_in_mm")
    val widthInMm: Int?,
    @Column(name = "thickness_in_mm")
    val thicknessInMm: Int?,
    @Column(name = "weight_in_grams")
    val weightInGrams: Int?
)