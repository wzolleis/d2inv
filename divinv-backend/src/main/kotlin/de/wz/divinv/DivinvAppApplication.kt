package de.wz.divinv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(
    scanBasePackages = ["de.wz.divinv"]
)
open class DivinvAppApplication

fun main(args: Array<String>) {
    runApplication<DivinvAppApplication>(*args)
}
