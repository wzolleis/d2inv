package de.wz.divinv.application.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DivinvAppApplication

fun main(args: Array<String>) {
    runApplication<DivinvAppApplication>(*args)
}
