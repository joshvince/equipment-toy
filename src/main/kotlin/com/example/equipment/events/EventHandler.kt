package com.example.equipment.events

class EventHandler(private val event: Event) {
    init {
        when (event.eventType) {
            "CargoAdded" -> createPiece(event)
            "CargoRemoved" -> removePiece(event)
            "CargoUpdated" -> updatePiece(event)
            else -> throw Exception("Hi there!")
        }
    }

    private fun createPiece(event: Event): Unit {
        //TODO: implement this
    }

    private fun removePiece(event: Event): Unit {
        //TODO: implement this
    }

    private fun updatePiece(event: Event): Unit {
        //TODO: implement this
    }
}


