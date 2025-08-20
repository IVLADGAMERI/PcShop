package com.cmd.PcShop.domain.dao.product.entity.cooling

import com.cmd.PcShop.domain.dao.product.entity.Product
import com.cmd.PcShop.domain.dao.product.entity.cpu.CpuSocket
import com.cmd.PcShop.domain.dao.product.embeddable.fan.FanSpec
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

@Entity(name = "cpu_fans")
class CpuFan (
    @Embedded
    var fanSpec: FanSpec,
    @Column(name = "tdp", nullable = false)
    var tdp: Int,
    @Column(name = "radiator_material", nullable = false, length = 32)
    var radiatorMaterial: String,
    @Column(name = "thermal_tubes_number", nullable = false)
    var thermalTubesNumber: Int,
    @Column(name = "has_display", nullable = false)
    var hasDisplay: Boolean,
    @ManyToMany
    @JoinTable(
        name = "cpu_fans_sockets",
        joinColumns = [JoinColumn(name = "fan_id")],
        inverseJoinColumns = [JoinColumn(name = "socket_id")])
    var supportedSockets: Set<CpuSocket>,
) : Product()