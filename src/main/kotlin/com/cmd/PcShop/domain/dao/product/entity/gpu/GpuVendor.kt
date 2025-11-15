package com.cmd.PcShop.domain.dao.product.entity.gpu

import jakarta.persistence.*

@Entity(name = "gpu_vendors")
data class GpuVendor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false)
    var name: String
)