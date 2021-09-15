package com.example.josh.events

class EventPublisher {
    companion object {
        fun generateEvent(): Event {
            return eventList.random()
        }

        private val eventList: List<Event> = listOf(
            Event(eventType = "CargoAdded"),
            Event(eventType = "CargoRemoved"),
            Event(eventType = "CargoUpdated")
        )
    }
}
