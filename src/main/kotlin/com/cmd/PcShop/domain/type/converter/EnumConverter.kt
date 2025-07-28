package com.cmd.PcShop.domain.type.converter

import jakarta.persistence.AttributeConverter

open class EnumConverter<X : Enum<X>> (private val enumClass : Class<X>) : AttributeConverter<X, String> {
    override fun convertToDatabaseColumn(p0: X?): String? {
        return p0?.name
    }

    override fun convertToEntityAttribute(p0: String?): X? {
        return p0?.let { enumClass.enumConstants.firstOrNull { it.name == p0 } }
    }
}