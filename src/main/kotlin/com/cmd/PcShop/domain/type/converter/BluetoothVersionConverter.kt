package com.cmd.PcShop.domain.type.converter

import com.cmd.PcShop.domain.type.BluetoothVersion
import jakarta.persistence.Converter

@Converter(autoApply = true)
class BluetoothVersionConverter : EnumConverter<BluetoothVersion>(BluetoothVersion::class.java)