package com.cmd.PcShop.domain.repository

import com.cmd.PcShop.domain.dao.product.entity.ram.RAM
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RAMRepository : JpaRepository<RAM, Long> {
}