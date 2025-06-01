package com.cmd.PcShop.web.response.mapper

import com.cmd.PcShop.domain.dao.Product
import com.cmd.PcShop.web.response.product.ProductResponse
import com.cmd.PcShop.web.url.product.ProductUrlBuilder
import org.springframework.stereotype.Component

@Component
class ProductResponseMapper (
    private var productUrlBuilder: ProductUrlBuilder
) {
    fun map(entity: Product) : ProductResponse {
        val id = entity.id
        val name = entity.name
        val price = entity.price
        val url = productUrlBuilder.build(entity)
        return ProductResponse(id, name, price, url)
    }

    fun map(entities: List<Product>) : List<ProductResponse> {
        return entities.map { this.map(it) }
    }
}