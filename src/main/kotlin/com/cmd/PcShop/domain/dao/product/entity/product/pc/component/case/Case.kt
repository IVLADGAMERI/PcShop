package com.cmd.PcShop.domain.dao.product.entity.product.pc.component.case

import com.cmd.PcShop.domain.dao.product.entity.product.Product
import com.cmd.PcShop.domain.dao.product.embeddable.case.CaseConnectorsSpec
import com.cmd.PcShop.domain.type.*
import jakarta.persistence.CollectionTable
import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.UniqueConstraint

@Entity(name = "pc_cases")
data class Case (
    @Column(name = "form_factor", nullable = false)
    var formFactor: CaseFormFactor,
    @ElementCollection
    @CollectionTable(
        name = "case_supported_mobo_form_factor",
        joinColumns = [JoinColumn(name = "case_id")],
        uniqueConstraints = [UniqueConstraint(columnNames = ["case_id", "mobo_form_factor"])]
    )
    @Column(name = "mobo_form_factor", nullable = false)
    var supportedFormFactors: HashSet<MotherboardFormFactor>,
    @Column(name = "max_cpu_cooler_height_in_mm", nullable = false)
    var maxCpuCoolerHeightInMm: Int,
    @Column(name = "max_gpu_length_in_mm", nullable = false)
    var maxGpuLengthInMm: Int,
    @Column(name = "max_psu_length_in_mm", nullable = false)
    var maxPsuLengthInMM: Int,
    @Column(name = "psu_form_factor", nullable = false)
    var psuFormFactor: PsuFormFactor,
    @Column(nullable = false, length = 16)
    var color: String,
    @Column(name = "case_materials", length = 32, nullable = false)
    var caseMaterials: String,
    @Column(name = "front_panel_materials", length = 32, nullable = false)
    var frontPanelMaterials: String,
    @Column(name = "window_materials", length = 32, nullable = false)
    var windowMaterials: String,
    @Column(name = "has_window", nullable = false)
    var hasWindow: Boolean,
    @Column(name = "has_dust_filters", nullable = false)
    var hasDustFilters: Boolean,
    @Column(name = "horizontal_extension_slots_number", nullable = false)
    var horizontalExtensionSlotsNumber: Int,
    @Column(name = "vertical_extension_slots_number", nullable = false)
    var verticalExtensionSlotsNumber: Int,
    @Column(name = "backlight", length = 16)
    var backlight: String?,
    @Column(name = "has_carrying_handle", nullable = false)
    var hasCarryingHandle: Boolean,
    @Column(name = "has_sound_insulation", nullable = false)
    var hasSoundInsulation: Boolean,
    @Column(name = "has_display", nullable = false)
    var hasDisplay: Boolean,
    @Column(name = "total_fan_mount_number", nullable = false)
    var totalFanSeatNumber: Int,
    @Column(name = "installed_fan_number", nullable = false)
    var installedFanNumber: Int,
    @Column(name = "fan_mount_layout", length = 64)
    var fanMountLayout: String?,
    @Column(name = "installed_fan_backlight", nullable = false)
    var installedFanBacklight: FanBacklightType,
    @Column(name = "installed_psu_power_in_watts")
    var installedPsuPowerInWatts: Int?,
    @Column(name = "psu_mount_type", nullable = false)
    var psuMountType: CasePsuMountType,
    @Embedded
    var connectorsSpec: CaseConnectorsSpec,
) : Product()