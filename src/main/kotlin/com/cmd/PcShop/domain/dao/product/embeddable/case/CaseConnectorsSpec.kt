package com.cmd.PcShop.domain.dao.product.embeddable.case

import com.cmd.PcShop.domain.dao.product.embeddable.GeneralUsbConnectorsSpec
import com.cmd.PcShop.domain.dao.product.embeddable.ThreePointFiveConnectorsSpec
import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

@Embeddable
class CaseConnectorsSpec(
    @Embedded
    var usbConnectorsSpec: GeneralUsbConnectorsSpec,
    @Column(name = "has_card_reader", nullable = false)
    var hasCardReader: Boolean,
    @Embedded
    var threePointFiveConnectorsSpec: ThreePointFiveConnectorsSpec
)