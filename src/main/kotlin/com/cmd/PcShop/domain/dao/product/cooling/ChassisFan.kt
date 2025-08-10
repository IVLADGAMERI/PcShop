package com.cmd.PcShop.domain.dao.product.cooling

import com.cmd.PcShop.domain.dao.product.Product
import com.cmd.PcShop.domain.dao.product.embeddable.fan.FanSpec
import com.cmd.PcShop.domain.type.FanAirFlowDirection
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity

@Entity(name = "chassis_fans")
class ChassisFan (
    @Embedded
    var fanSpec: FanSpec,
    @Column(name = "has_chassis_connector", nullable = false)
    var hasChassisConnector: Boolean,
    @Column(name = "air_flow_direction", nullable = false)
    var airFlowDirection: FanAirFlowDirection,
) : Product()