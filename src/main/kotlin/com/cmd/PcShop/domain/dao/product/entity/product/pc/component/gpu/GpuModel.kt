package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.gpu

import jakarta.persistence.*

@Entity(name = "gpu_models")
data class GpuModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @ManyToOne
    @JoinColumn(name = "generation_id", nullable = false)
    var generation: com.cmd.PcShop.domain.dao.product.entity.product.pc.component.gpu.GpuGeneration,
    @Column(nullable = false, unique = true, length = 20)
    var name: String
)