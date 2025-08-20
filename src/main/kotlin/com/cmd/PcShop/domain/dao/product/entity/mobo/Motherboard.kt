package com.cmd.PcShop.domain.dao.product.entity.mobo

import com.cmd.PcShop.domain.dao.product.entity.Product
import com.cmd.PcShop.domain.dao.product.entity.cpu.CpuSocket
import com.cmd.PcShop.domain.dao.product.embeddable.*
import com.cmd.PcShop.domain.dao.product.embeddable.mobo.*
import com.cmd.PcShop.domain.type.*
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Embedded
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
    @Embedded
    var ramSpec: MotherboardRamSpec,
    @Column(name = "backlight_color", length = 15)
    var backlightColor: String?,
    @Embedded
    var pcieSpec: MotherboardPcieSpec,
    @Embedded
    var vrmSpec: MotherboardVrmSpec,
    @Embedded
    var driveSpec: MotherboardDriveSpec,
    @Column(name = "wifi_version")
    var wifiVersion: WifiVersion?,
    @Column(name = "bluetooth_version")
    var bluetoothVersion: BluetoothVersion?,
    @Column(name = "ethernet_info")
    var ethernetInfo: String?,
    @Column(name = "igpu_support")
    var igpuSupport: Boolean,
    @Column(name = "sli_or_crossfire_support")
    var sliOrCrossfireSupport: String?,
    @Column(name = "sound_card")
    var soundCard: String?,
    @Embedded
    var usbSpec: MotherboardUsbSpec,
    @Column(name = "spdif_number", nullable = false)
    var spdifNumber: Int,
    @Embedded
    var threePointFiveConnectorsSpec: ThreePointFiveConnectorsSpec,
    @Column(name = "ps2_number", nullable = false)
    var ps2Number: Int,
    @Embedded
    var displayInterfacesSpec: DisplayInterfacesSpec,
    @Embedded
    var usbHeaderSpec: MotherboardUsbHeaderSpec,
    @Embedded
    var coolingHeaderSpec: MotherboardCoolingHeaderSpec,
    @Embedded
    var backlightHeaderSpec: MotherboardBacklightHeaderSpec,
    @Column(name = "headers_additional_info", length = 512)
    var headersAdditionalInfo: String?
) : Product()
