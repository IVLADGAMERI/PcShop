package com.cmd.PcShop.web.controller

import com.cmd.PcShop.domain.dao.Category
import com.cmd.PcShop.service.CategoryService
import com.cmd.PcShop.web.request.PagedDataRequest
import com.cmd.PcShop.web.response.PagedDataResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryController (
    private val categoryService: CategoryService
) {
    @GetMapping
    fun getPaged(@ModelAttribute pagedDataRequest: PagedDataRequest) : PagedDataResponse<Category> {
        return categoryService.getPaged(pagedDataRequest)
    }
}