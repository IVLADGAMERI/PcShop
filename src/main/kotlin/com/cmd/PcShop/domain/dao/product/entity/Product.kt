package com.cmd.PcShop.domain.dao.product.entity

import com.cmd.PcShop.domain.dao.product.embeddable.PhysicalSpec
import jakarta.persistence.*

@Entity(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(nullable = false, unique = true)
    var name: String = ""
    var price: Double? = 0.0
    var description: String? = null
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    lateinit var category: Category
    @Embedded
    var physicalSpec: PhysicalSpec? = null
}