package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.SSDFlashType
import jakarta.persistence.Converter

@Converter(autoApply = true)
class SSDFlashTypeConverter : EnumConverter<SSDFlashType>(SSDFlashType::class.java)