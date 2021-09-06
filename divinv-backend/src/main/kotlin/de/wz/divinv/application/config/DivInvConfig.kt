package de.wz.divinv.application.config

import de.wz.divinv.items.application.ItemController
import de.wz.divinv.items.domain.repo.ItemRepo
import de.wz.divinv.items.domain.service.ItemService
import de.wz.divinv.items.infrastructure.ItemRepoJPA
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
open class DivInvConfig {
    @Bean
    fun itemRepo(): ItemRepo = ItemRepoJPA()

    @Bean
    fun itemService(): ItemService {
        return ItemService(itemRepo())
    }

    @Bean
    fun itemController(): ItemController {
        return ItemController(itemService())
    }
}