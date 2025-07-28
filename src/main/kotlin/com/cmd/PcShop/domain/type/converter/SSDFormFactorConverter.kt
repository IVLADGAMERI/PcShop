package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.SSDFormFactor
import jakarta.persistence.Converter

@Converter(autoApply = true)
class SSDFormFactorConverter : EnumConverter<SSDFormFactor>(SSDFormFactor::class.java)