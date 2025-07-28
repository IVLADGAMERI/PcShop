package com.cmd.PcShop.web.response.mapper

import com.cmd.PcShop.web.response.PagedDataResponse
import org.springframework.data.domain.Page
import org.springframework.stereotype.Component

@Component
class PagedDataResponseMapper<T> {
    fun map(page: Page<T>) : PagedDataResponse<T> {
        val response = PagedDataResponse<T>(
            totalPages = page.totalPages,
            data = page.toList()
        )
        return response
    }
}