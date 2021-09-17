package com.example.equipment.events

class EventPublisher {
    companion object {
        fun generateEvent(eventName: String? = null): Event = when (eventName) {
                is String -> findOrGenerateEvent(eventName)
                else -> eventList.random()
            }

        private fun findOrGenerateEvent(eventName: String): Event {
            val foundEvent: Event? = eventList.find { it.eventType == eventName  }
            return foundEvent ?: eventList.random()
        }

        private val eventList: List<Event> = listOf(
            Event(eventType = "CargoAdded"),
            Event(eventType = "CargoRemoved"),
            Event(eventType = "CargoUpdated")
        )
    }
}
