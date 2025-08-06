package com.cmd.PcShop.web.response.product.general

data class DisplayInterfacesResponseSpec (
    val displayPortNumber: Int,
    val displayPortVersion: String?,
    val miniDisplayPortNumber: Int,
    val vgaNumber: Int,
    val dviNumber: Int,
    val hdmiNumber: Int,
    val hdmiVersion: String?,
)