package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.RamChannelMode
import jakarta.persistence.Converter

@Converter(autoApply = true)
class RamChannelModeConverter : EnumConverter<RamChannelMode>(RamChannelMode::class.java)