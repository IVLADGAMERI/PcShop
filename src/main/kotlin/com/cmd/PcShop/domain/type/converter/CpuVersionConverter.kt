package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.CpuVersion
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class CpuVersionConverter : AttributeConverter<CpuVersion, String> {
    override fun convertToDatabaseColumn(p0: CpuVersion?): String? {
        return p0?.name
    }

    override fun convertToEntityAttribute(p0: String?): CpuVersion? {
        return p0?.let { CpuVersion.valueOf(p0) }
    }
}