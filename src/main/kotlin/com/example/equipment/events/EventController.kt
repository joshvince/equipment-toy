package com.example.equipment.events

import com.example.equipment.piece.PieceRepository
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EventController(private val repository: PieceRepository) {
    @GetMapping("/event/{eventName}")
    @ResponseBody
    fun handleGet(@PathVariable eventName: String): String {
        val event = EventPublisher.generateEvent(eventName)
        EventHandler(event, repository)
        return returnEventName(event)
    }

    @GetMapping("/event")
    @ResponseBody
    fun handleGet(): String {
        val event = EventPublisher.generateEvent()
        EventHandler(event, repository)
        return returnEventName(event)
    }

    private fun returnEventName(event: Event): String = "The event fired was ${event.eventType}"
}