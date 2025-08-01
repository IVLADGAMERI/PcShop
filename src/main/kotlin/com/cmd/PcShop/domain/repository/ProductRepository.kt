package com.cmd.PcShop.domain.repository

import com.cmd.PcShop.domain.dao.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {

}