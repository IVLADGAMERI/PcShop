package com.cmd.PcShop.domain.repository

import com.cmd.PcShop.domain.dao.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Int> {
}