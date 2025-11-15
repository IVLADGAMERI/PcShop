package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.mobo

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "motherboards_manufacturers")
data class MotherboardManufacturer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true)
    var name: String
)