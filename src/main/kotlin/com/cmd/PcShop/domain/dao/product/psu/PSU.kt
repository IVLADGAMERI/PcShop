package com.cmd.PcShop.domain.dao.product.psu

import com.cmd.PcShop.domain.dao.product.Product
import com.cmd.PcShop.domain.type.*
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "psu")
class PSU (
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "manufacturer_id", nullable = false)
    var manufacturer: PsuManufacturer,
    @Column(name = "power_in_watts", nullable = false)
    var powerInWatts: Int,
    @Column(name = "form_factor", nullable = false)
    var formFactor: PsuFormFactor,
    @Column(name = "certificate", nullable = false)
    var certificate: Psu80PlusCertificate,
    @Column(name = "pfc_correction_type", nullable = false)
    var pfcCorrectionType: PsuPfcCorrectionType,
    @Column(name = "min_input_voltage", nullable = false)
    var minInputVoltage: Int,
    @Column(name = "max_input_voltage", nullable = false)
    var maxInputVoltage: Int,
    @Column(name = "max_12v_current_in_amp", nullable = false)
    var max12VCurrentInAmp: Float,
    @Column(nullable = false)
    var efficiency: Float,
    @Column(name = "fan_diameter")
    var fanDiameter: Int?,
    @Column(name = "fan_number", nullable = false)
    var fanNumber: Int,
    @Column(name = "fan_bearing_type")
    var fanBearingType: FanBearingType?,
    @Column(name = "has_fan_backlight", nullable = false)
    var hasFanBacklight: Boolean,
    @Column(name = "has_case_backlight", nullable = false)
    var hasCaseBacklight: Boolean,
    @Column(length = 16)
    var color: String?,
    @Column(name = "modularity_type", nullable = false)
    var modularityType: PsuModularityType,
    @Column(name = "twenty_four_pin_connector_type", nullable = false)
    var twentyFourPinConnectorType: Psu24PinConnectorType,
    @Column(name = "cpu_4_pin_number", nullable = false)
    var cpu4PinNumber: Int,
    @Column(name = "cpu_4_plus_4_pin", nullable = false)
    var cpu4Plus4PinNumber: Int,
    @Column(name = "cpu_8_pin_number", nullable = false)
    var cpu8PinNumber: Int,
    @Column(name = "pcie_gen5_number", nullable = false)
    var pcieGen5Number: Int,
    @Column(name = "pcie_gen5_connector_type", nullable = false)
    var pcieGen5ConnectorType: PsuPcieGen5ConnectorType,
    @Column(name = "ide_4_pin_number", nullable = false)
    var ide4PinNumber: Int,
    @Column(name = "sata_number", nullable = false)
    var sataNumber: Int,
    @Column(name = "pcie_6_pin_number", nullable = false)
    var pcie6PinNumber: Int,
    @Column(name = "pcie_6_plus_2_pin_number", nullable = false)
    var pcie6Plus2PinNumber: Int,
    @Column(name = "pcie_8_pin_number", nullable = false)
    var pcie8PinNumber: Int,
) : Product()