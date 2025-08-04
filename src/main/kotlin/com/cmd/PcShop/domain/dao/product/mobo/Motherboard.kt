package com.cmd.PcShop.domain.dao.product.mobo

import com.cmd.PcShop.domain.dao.product.Product
import com.cmd.PcShop.domain.dao.product.cpu.CpuSocket
import com.cmd.PcShop.domain.type.*
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "motherboards")
class Motherboard (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: MotherboardManufacturer,
    @Column(name = "form_factor", nullable = false)
    var formFactor: MotherboardFormFactor,
    @ManyToOne
    @JoinColumn(name = "socket_id", nullable = false)
    var socket: CpuSocket,
    @ManyToOne
    @JoinColumn(name = "chipset_id", nullable = false)
    var chipset: Chipset,
    @Column(name = "ram_type", nullable = false)
    var ramType: MotherboardRamType,
    @Column(name = "max_ram_clock_in_MGHz", nullable = false)
    var maxRamClockInMGHz: Int,
    @Column(name = "ram_number", nullable = false)
    var ramNumber: Int,
    @Column(name = "max_ram_volume_in_gb", nullable = false)
    var maxRamVolumeInGb: Int,
    @Column(name = "ram_channel_mode", nullable = false)
    var ramChannelMode: RamChannelMode,
    @Column(name = "backlight_color", length = 15)
    var backlightColor: String?,
    @Column(name = "ram_additional_info", length = 512)
    var ramAdditionalInfo: String?,
    @Column(name = "pcie_version", nullable = false)
    var pcieVersion: PCIEVersion,
    @Column(name = "pcie_x16_number")
    var pcieX16Number: Int?,
    @Column(name = "pcie_x8_number")
    var pcieX8Number: Int?,
    @Column(name = "pcie_x4_number")
    var pcieX4Number: Int?,
    @Column(name = "pcie_x1_number")
    var pcieX1Number: Int?,
    @Column(name = "pcie_additional_info", length = 512)
    var pcieAdditionalInfo: String?,
    @Column(name = "m2_number")
    var m2Number: Int?,
    @Column(name = "sata_3_number")
    var sata3Number: Int?,
    @Column(name = "sata_2_number")
    var sata2Number: Int?,
    @Column(name = "raid_info", length = 32)
    var raidInfo: String?,
    @Column(name = "wifi_version")
    var wifiVersion: WifiVersion?,
    @Column(name = "bluetooth_version")
    var bluetoothVersion: BluetoothVersion?,
    @Column(name = "ethernet_info")
    var ethernetInfo: String?,
    @Column(name = "igpu_support")
    var igpuSupport: Boolean,
    @Column(name = "sli_or_crossfile_support")
    var sliOrCrossfireSupport: String?,
    @Column(name = "sound_card")
    var soundCard: String?,
    @Column(name = "external_usb_2_number", nullable = false)
    var externalUsb2Number: Int,
    @Column(name = "external_usb_32_gen_1_number", nullable = false)
    var externalUsb32Gen1Number: Int,
    @Column(name = "external_usb_32_gen_2_number", nullable = false)
    var externalUsb32Gen2Number: Int,
    @Column(name = "external_usb_32_gen_1_type_c_number", nullable = false)
    var externalUsb32Gen1TypeCNumber: Int,
    @Column(name = "external_usb_32_gen_2_type_c_number", nullable = false)
    var externalUsb32Gen2TypeCNumber: Int,
    @Column(name = "external_usb_32_gen_2x2_number", nullable = false)
    var externalUsb32Gen2x2Number: Int,
    @Column(name = "external_usb_4_number", nullable = false)
    var externalUsb4Number: Int,
    @Column(name = "external_usb_thunderbolt_3_number", nullable = false)
    var externalUsbThunderbolt3Number: Int,
    @Column(name = "external_usb_thunderbolt_4_number", nullable = false)
    var externalUsbThunderbolt4Number: Int,

) : Product()
