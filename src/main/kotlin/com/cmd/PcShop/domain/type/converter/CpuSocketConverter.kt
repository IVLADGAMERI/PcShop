package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.CpuSocket
import jakarta.persistence.Converter

@Converter(autoApply = true)
class CpuSocketConverter : EnumConverter<CpuSocket>(CpuSocket::class.java)