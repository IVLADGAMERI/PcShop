package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.Chipset
import jakarta.persistence.Converter

@Converter(autoApply = true)
class ChipsetConverter : EnumConverter<Chipset>(Chipset::class.java)