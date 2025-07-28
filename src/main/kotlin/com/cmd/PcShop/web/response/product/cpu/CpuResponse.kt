package com.cmd.PcShop.web.response.product.cpu

import com.cmd.PcShop.web.response.product.ProductResponse

data class CpuResponse (
    val manufacturer: String,
    val series: String,
    val model: String,
    val baseClock: Int,
    val maxClock: Int,
    val coreCount: Int,
    val threadCount: Int,
    val maxTdp: Int,
    val l1CacheSize: Int,
    val l2CacheSize: Int,
    val l3CacheSize: Int,
    val maxRamVolume: Int,
    val ramType: String,
    val processSize: Int,
    val version: String,
    val socket: String,
    val maxRamClock: Int,
    override val id: Long,
    override val name: String,
    override val price: Double?,
    override val url: String,
    override val description: String?
) : ProductResponse