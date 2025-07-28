package com.cmd.PcShop.web.response.product

data class RamResponse (
    val manufacturer: String,
    val type: String,
    val clockInMGHz: Int,
    val volumeInGb : Int,
    val casLatency : Int,
    val timings : String,
    val voltage : Float,
    val hasXmpProfile : Boolean,
    val hasAmdExpoProfile : Boolean,
    val hasRadiator : Boolean,
    val isLowProfile : Boolean,
    val backlightColor : String?,
    val  color : String,
    override val id: Long,
    override val name: String,
    override val price: Double?,
    override val url: String,
    override val description: String?
) : ProductResponse