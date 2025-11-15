package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.GpuInterface
import jakarta.persistence.Converter

@Converter(autoApply = true)
class GpuInterfaceConverter : EnumConverter<GpuInterface>(GpuInterface::class.java)