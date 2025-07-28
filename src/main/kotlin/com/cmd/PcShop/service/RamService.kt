package com.cmd.PcShop.service

import com.cmd.PcShop.domain.repository.RAMRepository
import com.cmd.PcShop.web.request.PagedDataRequest
import com.cmd.PcShop.web.response.PagedDataResponse
import com.cmd.PcShop.web.response.mapper.RamResponseMapper
import com.cmd.PcShop.web.response.mapper.PagedDataResponseMapper
import com.cmd.PcShop.web.response.product.RamResponse
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated

@Service
class RamService (
    private val ramRepository: RAMRepository,
    private val pagedDataResponseMapper: PagedDataResponseMapper<RamResponse>,
    private val ramResponseMapper: RamResponseMapper
) {
    fun getPaged(@Validated request: PagedDataRequest) : PagedDataResponse<RamResponse> {
        val sortDirection = if (request.sortDirection < 0) Sort.Direction.DESC else Sort.Direction.ASC
        val pageRequest = PageRequest.of(request.pageIndex, request.pageSize, sortDirection, request.sortParam)
        val entityPage = ramRepository.findAll(pageRequest)
        val responsePage = entityPage.map{ramResponseMapper.map(it)}
        return pagedDataResponseMapper.map(responsePage)
    }
}