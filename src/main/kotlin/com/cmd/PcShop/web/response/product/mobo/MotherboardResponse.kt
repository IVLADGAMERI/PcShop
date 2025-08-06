package com.cmd.PcShop.web.response.product.mobo

import com.cmd.PcShop.web.response.product.ProductResponse
import com.cmd.PcShop.web.response.product.general.DisplayInterfacesResponseSpec

data class MotherboardResponse (
    val manufacturer: String,
    val formFactor: String,
    val socket: String,
    val chipset: String,
    val supportedCpuGenerations: Set<String>,
    val vrmConfig: String,
    val hasVrmCooling: Boolean,
    val igpuSupport: Boolean,
    val sliOrCrossfireSupport: String?,
    val backlightColor: String?,
    val soundCard: String?,
    val ramSpec: MotherboardResponseRamSpec,
    val expansionSlotsSpec: MotherboardResponseExpansionSlotsSpec,
    val storageInterfacesSpec: MotherboardResponseStorageInterfacesSpec,
    val communicationSpec: MotherboardResponseCommunicationSpec,
    val rearUsbSpec: MotherboardResponseRearUsbSpec,
    val rearAudioSpec: MotherboardResponseRearAudioSpec,
    val ps2Number: Int,
    val displayInterfacesSpec: DisplayInterfacesResponseSpec,
    val usbHeadersSpec: MotherboardResponseUsbHeadersSpec,
    val coolingHeadersSpec: MotherboardCoolingHeadersSpec,
    val backlightHeadersSpec: MotherboardResponseBacklightHeadersSpec,
    val headersAdditionalInfo: String?,
    override val id: Long,
    override val name: String,
    override val price: Double?,
    override val url: String,
    override val description: String?
) : ProductResponse