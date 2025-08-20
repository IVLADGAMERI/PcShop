package com.cmd.PcShop.domain.dao.product.entity.mobo

import com.cmd.PcShop.domain.dao.product.entity.cpu.CpuGeneration
import com.cmd.PcShop.domain.dao.product.entity.cpu.CpuSocket
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne

@Entity(name = "chipsets")
class Chipset(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true)
    var name: String,
    @ManyToOne
    @JoinColumn(name = "socket_id")
    var socket: CpuSocket,
    @ManyToMany
    @JoinTable(
        name = "chipset_cpu_generation_support",
        joinColumns = [JoinColumn(name = "chipset_id")],
        inverseJoinColumns = [JoinColumn(name = "generation_id")]
    )
    var supportedCpuGenerations: Set<CpuGeneration> = emptySet()
)
