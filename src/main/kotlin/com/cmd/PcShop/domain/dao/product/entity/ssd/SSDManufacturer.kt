package com.cmd.PcShop.domain.dao.product.entity.ssd

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "ssd_manufacturers")
data class SSDManufacturer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true, length = 15)
    var name: String
)