package com.cmd.PcShop.domain.dao.product.embeddable.mobo

import com.cmd.PcShop.domain.dao.product.embeddable.GeneralUsbConnectorsSpec
import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

@Embeddable
class MotherboardUsbSpec (
    @Embedded
    var generalUsbSpec: GeneralUsbConnectorsSpec,
    @Column(name = "usb_thunderbolt_3_number", nullable = false)
    var usbThunderbolt3Number: Int,
    @Column(name = "usb_thunderbolt_4_number", nullable = false)
    var usbThunderbolt4Number: Int,
)