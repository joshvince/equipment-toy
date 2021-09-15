package com.example.josh

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class GraphQLController {
    @GetMapping("/graphiql")
    @ResponseBody
    fun graphiQL(): List<String> {
        return listOf("graphiql", "is", "nice")
    }
}