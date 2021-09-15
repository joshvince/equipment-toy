package com.example.josh.events

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EventController {
    @GetMapping("/event")
    @ResponseBody
    fun handleGet(): String {
        val event = EventPublisher.generateEvent()
        // EventHandler(event = event)
        return "The event fired was ${event.eventType}"
    }
}