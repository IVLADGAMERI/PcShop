package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.RamType
import jakarta.persistence.AttributeConverter

class RamTypeConverter : AttributeConverter<RamType, String> {
    override fun convertToDatabaseColumn(p0: RamType?): String? {
        return p0?.name
    }

    override fun convertToEntityAttribute(p0: String?): RamType? {
        return p0?.let { RamType.valueOf(p0) }
    }

}