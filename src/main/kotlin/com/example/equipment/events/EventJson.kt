package com.example.equipment.events

import kotlinx.serialization.Serializable

@Serializable
data class EventJson(
    val eventType: String,
    val cargoType: String? = null,
    val collectionDate: String? = null,
    val collectionTime: String? = null,
    val zencargoReference: String? = null,
    val cargoId: String? = null
)
