package com.cmd.PcShop.domain.dao

import com.cmd.PcShop.domain.type.Chipset
import com.cmd.PcShop.domain.type.CpuSocket
import com.cmd.PcShop.domain.type.MotherboardFormFactor
import com.cmd.PcShop.domain.type.RamType
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity(name = "motherboards")
class Motherboard (
    @Column(name = "form_factor", nullable = false)
    var formFactor: MotherboardFormFactor,
    @Column(name = "ram_type", nullable = false)
    var ramType: RamType,
    @Column(name = "max_ram_clock", nullable = false)
    var maxRamClock: Int,
    @Column(nullable = false)
    var socket: CpuSocket,
    @Column(name = "ram_number", nullable = false)
    var ramNumber: Int,
    @Column(nullable = false)
    var chipset: Chipset
) : Product()