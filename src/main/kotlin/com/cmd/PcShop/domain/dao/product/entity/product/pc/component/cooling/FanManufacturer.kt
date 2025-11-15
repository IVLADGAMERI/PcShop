package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.cooling

import jakarta.persistence.*

@Entity(name = "fan_manufacturers")
data class FanManufacturer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true)
    var name: String
)