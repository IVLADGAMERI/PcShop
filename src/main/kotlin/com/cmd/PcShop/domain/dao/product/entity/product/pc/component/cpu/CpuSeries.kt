package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.cpu

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "cpu_series")
data class CpuSeries (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true, length = 20)
    var name: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: com.cmd.PcShop.domain.dao.product.entity.product.pc.component.cpu.CpuManufacturer,
    @ManyToOne
    @JoinColumn(name = "socket_id")
    var socket: com.cmd.PcShop.domain.dao.product.entity.product.pc.component.cpu.CpuSocket,
)