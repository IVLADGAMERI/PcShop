package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.WifiVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class WifiVersionConverter : EnumConverter<WifiVersion>(WifiVersion::class.java)