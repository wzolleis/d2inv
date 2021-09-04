package de.wz.divinv.application.config

import de.wz.divinv.items.application.ItemController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
open class DivInvConfig {
    @Bean
    fun itemController(): ItemController {
        return ItemController()
    }
}