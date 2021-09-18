package com.example.equipment.events

import com.example.equipment.piece.PieceService
import org.springframework.stereotype.Service

@Service
class EventService(private val pieceService: PieceService) {
    fun handleEvent(input: EventJson): Unit {
        val event = createEvent(input)

        when (event?.eventType) {
            EventType.CargoAdded -> pieceService.createPiece(event)
            EventType.CargoRemoved -> pieceService.removePiece(event)
            else -> throw Exception("The event was not a valid event")
        }
    }

    private fun createEvent(input: EventJson): Event? {
        val eventType: EventType = Event.initializeEventType(input.eventType) ?: return null

        return Event(
            eventType = eventType,
            cargoId = input.cargoId,
            cargoTypeString = input.cargoType,
            zencargoReference = input.zencargoReference,
            collectionDateString = input.collectionDate,
            collectionTimeString = input.collectionTime
        )
    }
}
