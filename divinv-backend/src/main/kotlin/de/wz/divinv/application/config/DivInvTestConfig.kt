package de.wz.divinv.application.config

import de.wz.divinv.infrastructure.ItemRepoMock
import de.wz.divinv.items.application.ItemController
import de.wz.divinv.items.domain.service.ItemService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class DivInvTestConfig {
    @Bean
    fun itemRepo() = ItemRepoMock()

    @Bean
    fun itemService(): ItemService {
        return ItemService(itemRepo())
    }

    @Bean
    fun itemController(): ItemController {
        return ItemController(itemService())
    }
}