package com.cmd.PcShop.web.response.mapper

import com.cmd.PcShop.domain.dao.Cpu
import com.cmd.PcShop.web.response.product.cpu.CpuResponse
import com.cmd.PcShop.web.url.product.ProductUrlBuilder
import org.springframework.stereotype.Component

@Component
class CpuResponseMapper (
    private var productUrlBuilder: ProductUrlBuilder
) {
    fun map(entity: Cpu) : CpuResponse {
        val manufacturer = entity.series.manufacturer.name
        val series = entity.series.name
        val version = entity.version.value
        val ramType = entity.ramType.value
        val url = productUrlBuilder.build(entity)
        return CpuResponse(
            id = entity.id,
            name = entity.name,
            price = entity.price,
            url = url,
            description = entity.description,
            manufacturer = manufacturer,
            series = series,
            version = version,
            l1CacheSize = entity.l1CacheSize,
            l2CacheSize = entity.l2CacheSize,
            l3CacheSize = entity.l3CacheSize,
            maxTdp = entity.maxTdp,
            baseClock = entity.baseClock,
            maxClock = entity.maxClock,
            coreCount = entity.coreCount,
            threadCount = entity.threadCount,
            maxRamVolume = entity.maxRamVolume,
            ramType = ramType,
            processSize = entity.processSize,
            model = entity.model,
            socket = entity.socket.value,
            maxRamClock = entity.maxRamClock
        )
    }

    fun map(entities: List<Cpu>) : List<CpuResponse> {
        return entities.map { this.map(it) }
    }
}