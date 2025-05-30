package com.cmd.PcShop.domain.dao

import jakarta.persistence.*

@Entity(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
open class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long = 0,
    @Column(nullable = false, unique = true)
    open var name: String = "",
    open var price: Double? = 0.0,
)