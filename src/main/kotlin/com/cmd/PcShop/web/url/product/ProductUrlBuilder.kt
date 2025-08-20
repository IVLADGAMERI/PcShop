package com.cmd.PcShop.web.url.product

import com.cmd.PcShop.domain.dao.product.entity.cpu.Cpu
import com.cmd.PcShop.domain.dao.product.entity.Product
import com.cmd.PcShop.domain.dao.product.entity.ram.RAM
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.util.UriComponentsBuilder

@Component
class ProductUrlBuilder(
    @Value("\${web.api.url.products}")
    private var base: String
) {
    fun build(product: Product): String {
        val uriBuilder: UriComponentsBuilder = UriComponentsBuilder.fromUriString(base)
        return when (product) {
            is Cpu -> uriBuilder.path("cpu").queryParam("id", product.id).build().toUriString()
            is RAM -> uriBuilder.path("ram").queryParam("id", product.id).build().toUriString()
            else -> throw IllegalArgumentException("Cannot build url: product class wasn't recognized")
        }
    }
}