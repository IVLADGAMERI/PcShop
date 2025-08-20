package com.cmd.PcShop.domain.dao.product.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class ThreePointFiveConnectorsSpec (
    @Column(name = "three_point_five_combined_connector_number", nullable = false)
    var threePointFiveCombinedConnectorNumber: Int,
    @Column(name = "three_point_five_output_connector_number", nullable = false)
    var threePointFiveOutputConnectorNumber: Int,
    @Column(name = "three_point_five_input_connector_number", nullable = false)
    var threePointFiveInputConnectorNumber: Int,
)