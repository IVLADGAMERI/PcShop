package com.cmd.PcShop.web.response

data class PagedDataResponse<T> (
    val totalPages: Int,
    val data: List<T>
)
