package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.CpuVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class CpuVersionConverter : EnumConverter<CpuVersion>(CpuVersion::class.java)