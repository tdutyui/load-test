package org.example.loadtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoadTestApplication

fun main(args: Array<String>) {
    runApplication<LoadTestApplication>(*args)
}
