package com.cmd.PcShop.domain.dao.product.cpu

import com.cmd.PcShop.domain.dao.product.Product
import com.cmd.PcShop.domain.type.CpuVersion
import com.cmd.PcShop.domain.type.RamType
import jakarta.persistence.*

@Entity(name = "cpus")
data class Cpu (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "series_id", nullable = false)
    var series: CpuSeries,
    @Column(nullable = false, unique = true)
    var model: String,
    @Column(name = "base_clock", nullable = false)
    var baseClock: Int,
    @Column(name = "max_clock", nullable = false)
    var maxClock: Int,
    @Column(name = "core_count", nullable = false)
    var coreCount: Int,
    @Column(name = "thread_count", nullable = false)
    var threadCount: Int,
    @Column(name = "max_tdp", nullable = false)
    var maxTdp: Int,
    @Column(name = "l1_cache_size", nullable = false)
    var l1CacheSize: Int,
    @Column(name = "l2_cache_size", nullable = false)
    var l2CacheSize: Int,
    @Column(name = "l3_cache_size", nullable = false)
    var l3CacheSize: Int,
    @Column(name = "max_ram_volume", nullable = false)
    var maxRamVolume: Int,
    @Column(name = "max_ram_clock", nullable = false)
    var maxRamClock: Int,
    @Column(name = "ram_type", nullable = false)
    var ramType: RamType,
    @Column(name = "process_size", nullable = false)
    var processSize: Int,
    @Column(name = "version", nullable = false)
    var version: CpuVersion,
) : Product()