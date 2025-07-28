package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.RamType
import jakarta.persistence.Converter

@Converter(autoApply = true)
class RamTypeConverter : EnumConverter<RamType>(RamType::class.java)