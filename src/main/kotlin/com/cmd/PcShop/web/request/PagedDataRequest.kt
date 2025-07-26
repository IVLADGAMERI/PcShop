package com.cmd.PcShop.web.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero
import org.hibernate.validator.constraints.Range
import org.springframework.validation.annotation.Validated

@Validated
open class PagedDataRequest (
    @PositiveOrZero
    var pageIndex: Int,
    @Range(min = 1, max = 20)
    var pageSize: Int,
    @Range(min = -1, max = 1)
    var sortDirection: Int,
    @NotBlank
    var sortParam: String
)