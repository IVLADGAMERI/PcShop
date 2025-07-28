package com.cmd.PcShop.web.response.product

interface ProductResponse {
    val id: Long
    val name: String
    val price: Double?
    val url: String
    val description: String?
}