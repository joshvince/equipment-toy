package com.example.equipment.events

import com.example.equipment.cargo.CargoType
import java.time.LocalDate
import java.time.LocalTime

interface EventSchema {
    val eventType: EventType
    val zencargoReference: String?
    val cargoId: String?
    val cargoType: CargoType?
    val collectionDate: LocalDate?
    val collectionTime: LocalTime?
}

enum class EventType {
    CargoAdded, CargoRemoved, CollectionDateUpdated, CollectionTimeUpdated;

    companion object {
        fun getEventTypeByName(name: String): EventType = valueOf(name)
    }
}
