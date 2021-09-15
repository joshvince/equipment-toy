package com.example.josh

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@Controller
class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    fun sayHello(): String {
        return "Hello world"
    }
}