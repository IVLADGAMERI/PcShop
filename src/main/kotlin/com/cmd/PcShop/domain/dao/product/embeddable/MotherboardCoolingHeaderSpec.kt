package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class MotherboardCoolingHeaderSpec (
    @Column(name = "cpu_fan_header_number", nullable = false)
    var cpuFanHeaderNumber: Int,
    @Column(name = "cpu_opt_fan_header_number", nullable = false)
    var cpuOptFanHeaderNumber: Int,
    @Column(name = "chassis_fan_header_number", nullable = false)
    var chassisFanHeaderNumber: Int,
    @Column(name = "water_pump_header_number", nullable = false)
    var waterPumpHeaderNumber: Int,
)