package com.example.josh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JoshApplication

fun main(args: Array<String>) {
    runApplication<JoshApplication>(*args)
}
