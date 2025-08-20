package com.cmd.PcShop.domain.dao.product.entity.cpu

import jakarta.persistence.*


@Entity(name = "cpu_manufacturers")
data class CpuManufacturer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true, length = 10)
    var name: String
)