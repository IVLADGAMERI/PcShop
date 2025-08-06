package com.cmd.PcShop.web.response.product.mobo

data class MotherboardResponseUsbHeadersSpec (
    val usb2HeaderNumber: Int,
    val usb32Gen1HeaderNumber: Int,
    val usb32Gen2HeaderNumber: Int,
    val usb32Gen1TypeCHeaderNumber: Int,
    val usb32Gen2TypeCHeaderNumber: Int,
    val usb32Gen2x2HeaderNumber: Int,
    val usb4HeaderNumber: Int,
    val thunderbolt3HeaderNumber: Int,
    val thunderbolt4HeaderNumber: Int,
)