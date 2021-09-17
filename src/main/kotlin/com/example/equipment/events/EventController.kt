package com.example.equipment.events

import com.example.equipment.piece.PieceService
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class EventController(private val service: PieceService) {
    @OptIn(ExperimentalSerializationApi::class)
    @PostMapping(path = ["/event"])
    @ResponseBody
    fun handlePost(@RequestBody body: String): String {
        val eventJson = Json.decodeFromString<EventJson>(body)
        EventService(service).handleEvent(eventJson)
        return eventJson.toString()
    }
}
