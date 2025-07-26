package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.Chipset
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class ChipsetConverter : AttributeConverter<Chipset, String> {
    override fun convertToDatabaseColumn(p0: Chipset?): String? {
        return p0?.name
    }

    override fun convertToEntityAttribute(p0: String?): Chipset? {
        return p0?.let { Chipset.valueOf(p0) }
    }
}