package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardUsbHeaderSpec (
    @Column(name = "usb_2_header_number", nullable = false)
    var usb2HeaderNumber: Int,
    @Column(name = "usb_32_gen_1_header_number", nullable = false)
    var usb32Gen1HeaderNumber: Int,
    @Column(name = "usb_32_gen_2_header_number", nullable = false)
    var usb32Gen2HeaderNumber: Int,
    @Column(name = "usb_32_gen_1_type_c_header_number", nullable = false)
    var usb32Gen1TypeCHeaderNumber: Int,
    @Column(name = "usb_32_gen_2_type_c_header_number", nullable = false)
    var usb32Gen2TypeCHeaderNumber: Int,
    @Column(name = "usb_32_gen_2x2_header_number", nullable = false)
    var usb32Gen2x2HeaderNumber: Int,
    @Column(name = "usb_4_header_number", nullable = false)
    var usb4HeaderNumber: Int,
    @Column(name = "thunderbolt_3_header_number", nullable = false)
    var thunderbolt3HeaderNumber: Int,
    @Column(name = "thunderbolt_4_header_number", nullable = false)
    var thunderbolt4HeaderNumber: Int,
)