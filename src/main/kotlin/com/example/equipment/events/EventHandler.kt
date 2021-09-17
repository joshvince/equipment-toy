package com.example.equipment.events

import com.example.equipment.piece.PieceRepository
import com.example.equipment.piece.PieceService
import com.example.equipment.piece.TransportMode

class EventHandler(private val event: Event, private val repository: PieceRepository) {
    init {
        when (event.eventType) {
            "CargoAdded" -> createPiece(event)
            "CargoRemoved" -> removePiece(event)
            "CargoUpdated" -> updatePiece(event)
            else -> throw Exception("Hi there!")
        }
    }

    private fun createPiece(event: Event): Unit {
        PieceService(repository).createPiece(transportMode = TransportMode.OCEAN, cargoCount = 1)
    }

    private fun removePiece(event: Event): Unit {
        //TODO: implement this
    }

    private fun updatePiece(event: Event): Unit {
        //TODO: implement this
    }
}


