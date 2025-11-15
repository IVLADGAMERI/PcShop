package com.cmd.PcShop.domain.dao.product.entity.gpu

import com.cmd.PcShop.domain.dao.product.embeddable.DisplayInterfacesSpec
import com.cmd.PcShop.domain.dao.product.entity.Product
import com.cmd.PcShop.domain.type.GpuInterface
import com.cmd.PcShop.domain.type.GpuPowerConnector
import com.cmd.PcShop.domain.type.VideoMemoryType
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "gpus")
data class Gpu (
    @ManyToOne
    @JoinColumn(name = "vendor_id")
    var vendor: GpuVendor,
    @ManyToOne
    @JoinColumn(name = "model_id")
    var model: GpuModel,
    @Column(name = "connection_interface", nullable = false)
    var connectionInterface: GpuInterface,
    @Column(name = "manufacturing_process", nullable = false)
    var manufacturingProcess: Int,
    @Column(name = "is_overclocked", nullable = false)
    var isOverclocked: Boolean,
    @Column(name = "has_rt", nullable = false)
    var hasRT: Boolean,
    @Column(name = "color", nullable = false, length = 32)
    var color: String,
    @Column(name = "base_clock_in_MGHz", nullable = false)
    var baseClockInMGHz: Int,
    @Column(name = "max_clock_in_MGHz", nullable = false)
    var maxClockInMGHz: Int,
    @Column(name = "thread_processors_number", nullable = false)
    var threadProcessorsNumber: Int,
    @Column(name = "rt_cores_number", nullable = false)
    var rtCoresNumber: Int,
    @Column(name = "video_memory_volume_in_gb", nullable = false)
    var videoMemoryVolumeInGb: Int,
    @Column(name = "video_memory_type", nullable = false)
    var videoMemoryType: VideoMemoryType,
    @Column(name = "memory_bus_resolution", nullable = false)
    var memoryBusResolution: Int,
    @Column(name = "power_connector", nullable = false)
    var powerConnector: GpuPowerConnector,
    @Column(name = "recommended_psu_power")
    var recommendedPsuPower: Int?,
    @Column(name = "radiator_thickness", nullable = false)
    var radiatorThickness: String,
    @Column(name = "fan_number", nullable = false)
    var fanNumber: Int,
    @Embedded
    var videoInterfacesSpec: DisplayInterfacesSpec
) : Product()