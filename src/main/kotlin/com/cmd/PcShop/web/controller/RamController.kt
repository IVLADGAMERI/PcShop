package com.cmd.PcShop.web.controller

import com.cmd.PcShop.service.RamService
import com.cmd.PcShop.web.request.PagedDataRequest
import com.cmd.PcShop.web.response.PagedDataResponse
import com.cmd.PcShop.web.response.product.ram.RamResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ram")
class RamController (
    private val ramService: RamService
) {
    @GetMapping
    fun getPaged(@ModelAttribute pagedDataRequest: PagedDataRequest) : PagedDataResponse<RamResponse> {
        return ramService.getPaged(pagedDataRequest)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) : RamResponse {
        return ramService.getById(id)
    }
}