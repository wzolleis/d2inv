package de.wz.divinv.application.config

import de.wz.divinv.mods.domain.service.ModServiceMock
import de.wz.divinv.mods.domain.repo.SkillModRepo
import de.wz.divinv.mods.domain.service.ModService
import de.wz.divinv.mods.infrastructure.SkillModRepoMock
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class DivInvTestConfig {
    @Bean
    fun skillServiceMock(): ModService = ModServiceMock(skillModRepoMock())

    @Bean
    fun skillModRepoMock(): SkillModRepo = SkillModRepoMock()
}