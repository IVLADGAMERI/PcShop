package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.DisplayPortVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class DisplayPortVersionConverter : EnumConverter<DisplayPortVersion>(DisplayPortVersion::class.java)