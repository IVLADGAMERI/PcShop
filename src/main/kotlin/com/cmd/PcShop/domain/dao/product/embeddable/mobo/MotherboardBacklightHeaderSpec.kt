package com.cmd.PcShop.domain.dao.product.embeddable.mobo

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardBacklightHeaderSpec (
    @Column(name = "rgb_12v_header_number", nullable = false)
    var rgb12VHeaderNumber: Int,
    @Column(name = "argb_5v_header_number", nullable = false)
    var argb5VHeaderNumber: Int,
)