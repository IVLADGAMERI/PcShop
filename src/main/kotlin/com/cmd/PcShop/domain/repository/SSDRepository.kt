package com.cmd.PcShop.domain.repository

import com.cmd.PcShop.domain.dao.product.entity.product.pc.component.ssd.SSD
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SSDRepository : JpaRepository<com.cmd.PcShop.domain.dao.product.entity.product.pc.component.ssd.SSD, Long> {
}