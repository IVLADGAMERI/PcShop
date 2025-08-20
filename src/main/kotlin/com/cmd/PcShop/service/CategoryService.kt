package com.cmd.PcShop.service

import com.cmd.PcShop.domain.dao.product.entity.Category
import com.cmd.PcShop.domain.repository.CategoryRepository
import com.cmd.PcShop.web.request.PagedDataRequest
import com.cmd.PcShop.web.response.PagedDataResponse
import com.cmd.PcShop.web.response.mapper.PagedDataResponseMapper
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated

@Service
class CategoryService (
    private val categoryRepository: CategoryRepository,
    private val pagedDataResponseMapper: PagedDataResponseMapper<Category>
) {
    fun getPaged(@Validated request: PagedDataRequest) : PagedDataResponse<Category> {
        val sortDirection = if (request.sortDirection < 0) Sort.Direction.DESC else Sort.Direction.ASC
        val pageRequest = PageRequest.of(request.pageIndex, request.pageSize, sortDirection, request.sortParam)
        val resultPage = categoryRepository.findAll(pageRequest)
        return pagedDataResponseMapper.map(resultPage)
    }
}