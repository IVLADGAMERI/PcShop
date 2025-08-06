package com.cmd.PcShop.web.response.product.mobo

data class MotherboardResponseRearUsbSpec (
    val usb2Number: Int,
    val usb32Gen1Number: Int,
    val usb32Gen2Number: Int,
    val usb32Gen1TypeCNumber: Int,
    val usb32Gen2TypeCNumber: Int,
    val usb32Gen2x2Number: Int,
    val usb4Number: Int,
    val usbThunderbolt3Number: Int,
    val usbThunderbolt4Number: Int,
)