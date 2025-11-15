package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.gpu

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "gpu_generations")
data class GpuGeneration (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: com.cmd.PcShop.domain.dao.product.entity.product.pc.component.gpu.GpuManufacturer,
    @Column(nullable = false)
    var name: String
)