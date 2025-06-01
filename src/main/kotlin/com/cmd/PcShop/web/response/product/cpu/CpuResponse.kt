package com.cmd.PcShop.web.response.product.cpu

import com.cmd.PcShop.web.response.product.ProductResponse

class CpuResponse (
    id: Long,
    name: String,
    price: Double?,
    url: String,
    var manufacturer: String,
    var series: String,
    var model: String,
    var baseClock: Int,
    var maxClock: Int,
    var coreCount: Int,
    var threadCount: Int,
    var maxTdp: Int,
    var l1CacheSize: Int,
    var l2CacheSize: Int,
    var l3CacheSize: Int,
    var maxRamVolume: Int,
    var ramType: String,
    var processSize: Int,
    var version: String
) : ProductResponse(id = id, name = name, price = price, url = url)