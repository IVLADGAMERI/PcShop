package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardUsbSpec (
    @Column(name = "usb_2_number", nullable = false)
    var usb2Number: Int,
    @Column(name = "usb_32_gen_1_number", nullable = false)
    var usb32Gen1Number: Int,
    @Column(name = "usb_32_gen_2_number", nullable = false)
    var usb32Gen2Number: Int,
    @Column(name = "usb_32_gen_1_type_c_number", nullable = false)
    var usb32Gen1TypeCNumber: Int,
    @Column(name = "usb_32_gen_2_type_c_number", nullable = false)
    var usb32Gen2TypeCNumber: Int,
    @Column(name = "usb_32_gen_2x2_number", nullable = false)
    var usb32Gen2x2Number: Int,
    @Column(name = "usb_4_number", nullable = false)
    var usb4Number: Int,
    @Column(name = "usb_thunderbolt_3_number", nullable = false)
    var usbThunderbolt3Number: Int,
    @Column(name = "usb_thunderbolt_4_number", nullable = false)
    var usbThunderbolt4Number: Int,
)