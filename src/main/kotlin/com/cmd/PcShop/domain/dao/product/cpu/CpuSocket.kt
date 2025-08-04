package com.cmd.PcShop.domain.dao.product.cpu

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity(name = "cpu_sockets")
class CpuSocket (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(nullable = false, unique = true)
    var name: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "socket_id", nullable = false)
    var generations: Set<CpuGeneration> = emptySet()
)