package com.cmd.PcShop.web.response.product.mobo

data class MotherboardResponseRamSpec (
    val type: String,
    val maxClockInMGHz: Int,
    val number: Int,
    val ramVolumeInGb: Int,
    val channelMode: String,
    val additionalInfo: String?,
)