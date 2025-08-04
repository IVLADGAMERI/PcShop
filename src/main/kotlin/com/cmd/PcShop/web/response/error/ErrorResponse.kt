package com.cmd.PcShop.web.response.error

import java.time.Instant

data class ErrorResponse (
    val message: String,
    val timestamp: Instant = Instant.now()
)