package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.MotherboardFormFactor
import jakarta.persistence.Converter

@Converter(autoApply = true)
class MotherboardFormFactorConverter : EnumConverter<MotherboardFormFactor>(MotherboardFormFactor::class.java)