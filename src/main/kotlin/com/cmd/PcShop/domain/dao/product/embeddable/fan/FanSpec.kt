package com.cmd.PcShop.domain.dao.product.embeddable.fan

import com.cmd.PcShop.domain.dao.product.cooling.FanManufacturer
import com.cmd.PcShop.domain.type.FanBacklightType
import com.cmd.PcShop.domain.type.FanConnectorType
import com.cmd.PcShop.domain.type.FanBearingType
import jakarta.persistence.*

@Embeddable
class FanSpec (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: FanManufacturer,
    @Column(nullable = false, length = 16)
    var color: String,
    @Column(name = "diameter_in_mm", nullable = false)
    var diameterInMm: Int,
    @Column(name = "bearing_type", nullable = false)
    var bearingType: FanBearingType,
    @Column(name = "min_rpm", nullable = false)
    var minRpm: Int,
    @Column(name = "max_rpm", nullable = false)
    var maxRpm: Int,
    @Column(name = "max_air_flow_in_cfm")
    var maxAirflowInCfm: Double,
    @Column(name = "noise_level_in_db")
    var noiseLevelInDb: Double,
    @Column(name = "has_pwm", nullable = false)
    var hasPwm: Boolean,
    @Column(name = "connector_type", nullable = false)
    var connectorType: FanConnectorType,
    @Column(name = "backlight_type", nullable = false)
    var backlightType: FanBacklightType,

)