package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.SSDBusStandard
import jakarta.persistence.Converter

@Converter(autoApply = true)
class SSDBusStandardConverter : EnumConverter<SSDBusStandard>(SSDBusStandard::class.java)