package com.cmd.PcShop.web.response.mapper

import com.cmd.PcShop.domain.dao.product.entity.product.pc.component.ram.RAM
import com.cmd.PcShop.web.response.product.ram.RamResponse
import com.cmd.PcShop.web.url.product.ProductUrlBuilder
import org.springframework.stereotype.Component

@Component
class RamResponseMapper (
    private var productUrlBuilder: ProductUrlBuilder
) {
    fun map(entity: com.cmd.PcShop.domain.dao.product.entity.product.pc.component.ram.RAM) : RamResponse {
        val manufacturer = entity.manufacturer.name
        val type = entity.type.value
        val url = productUrlBuilder.build(entity)
        return RamResponse(
            id = entity.id,
            name = entity.name,
            price = entity.price,
            url = url,
            description = entity.description,
            manufacturer = manufacturer,
            type = type,
            clockInMGHz = entity.clockInMGHz,
            volumeInGb = entity.volumeInGb,
            casLatency = entity.casLatency,
            timings = entity.timings,
            voltage = entity.voltage,
            hasXmpProfile = entity.hasXmpProfile,
            hasAmdExpoProfile = entity.hasAmdExpoProfile,
            hasRadiator = entity.hasRadiator,
            isLowProfile = entity.isLowProfile,
            backlightColor = entity.backlightColor,
            color = entity.color,
        )
    }
}