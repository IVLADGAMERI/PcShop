package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.PCIEVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class PCIEVersionConverter : EnumConverter<PCIEVersion>(PCIEVersion::class.java)