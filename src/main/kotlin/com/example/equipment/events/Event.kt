package com.example.equipment.events

import com.example.equipment.cargo.CargoType
import java.time.LocalDate
import java.time.LocalTime

class Event(
    override val eventType: EventType,
    cargoTypeString: String? = null,
    collectionDateString: String? = null,
    collectionTimeString: String? = null,
    override val cargoId: String? = null,
    override val zencargoReference: String? = null
    ) : EventSchema {

    override val cargoType: CargoType? = initializeCargoType(cargoTypeString)
    override val collectionDate: LocalDate? = LocalDate.parse(collectionDateString)
    override val collectionTime: LocalTime? = LocalTime.parse(collectionTimeString)

    companion object {
        fun initializeEventType(eventTypeString: String): EventType? {
            if(!isAValidEvent(eventTypeString)) return null

            return EventType.getEventTypeByName(eventTypeString)
        }

        private fun isAValidEvent(eventType : String): Boolean {
            return EventType.values().any { it.name == eventType }
        }
    }

    private fun initializeCargoType(cargoTypeString: String?): CargoType? {
        if(cargoTypeString == null) return null

        return CargoType.getCargoTypeByName(cargoTypeString)
    }
}
