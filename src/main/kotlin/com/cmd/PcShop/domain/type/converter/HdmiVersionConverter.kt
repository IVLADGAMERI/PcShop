package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.HdmiVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class HdmiVersionConverter : EnumConverter<HdmiVersion>(HdmiVersion::class.java)