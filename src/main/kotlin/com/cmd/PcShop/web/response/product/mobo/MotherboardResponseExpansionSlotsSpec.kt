package com.cmd.PcShop.web.response.product.mobo

data class MotherboardResponseExpansionSlotsSpec (
    val pcieVersion: String,
    val x16Number: Int,
    val x8Number: Int,
    val x4Number: Int,
    val x1Number: Int,
    val additionalInfo: String?,
)