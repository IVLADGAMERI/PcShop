package com.cmd.PcShop.domain.dao.product.embeddable

import com.cmd.PcShop.domain.type.DisplayPortVersion
import com.cmd.PcShop.domain.type.HdmiVersion
import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class VideoInterfaceSpec (
    @Column(name = "display_port_number", nullable = false)
    var displayPortNumber: Int,
    @Column(name = "display_port_version")
    var displayPortVersion: DisplayPortVersion,
    @Column(name = "mini_display_port_number", nullable = false)
    var miniDisplayPortNumber: Int,
    @Column(name = "vga_number", nullable = false)
    var vgaNumber: Int,
    @Column(name = "dvi_number", nullable = false)
    var dviNumber: Int,
    @Column(name = "hdmi_number", nullable = false)
    var hdmiNumber: Int,
    @Column(name = "hdmi_version")
    var hdmiVersion: HdmiVersion,
)