package de.wz.divinv.application.config

import de.wz.divinv.infrastructure.RepoFile
import de.wz.divinv.items.application.ItemController
import de.wz.divinv.items.domain.repo.ItemRepo
import de.wz.divinv.items.domain.service.ItemService
import de.wz.divinv.items.infrastructure.ItemRepoJson
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
class DivInvConfig {
    @Bean
    fun itemRepoFile(): RepoFile = RepoFile()

    @Bean
    fun itemRepo(): ItemRepo = ItemRepoJson(itemRepoFile())

    @Bean
    fun itemService(): ItemService {
        return ItemService(itemRepo())
    }

    @Bean
    fun itemController(): ItemController {
        return ItemController(itemService())
    }
}