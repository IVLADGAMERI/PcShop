package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.MotherboardRamType
import jakarta.persistence.Converter

@Converter(autoApply = true)
class MotherboardRamTypeConverter : EnumConverter<MotherboardRamType>(MotherboardRamType::class.java)