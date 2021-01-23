package de.wz.divinv.application.config

import de.wz.divinv.application.service.ModServiceMock
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import de.wz.divinv.domain.mods.service.ModService
import de.wz.divinv.infrastructure.mods.repo.GearModRepoMock
import de.wz.divinv.infrastructure.mods.repo.SkillModRepoMock
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class DivInvTestConfig {
    @Bean
    fun skillServiceMock(): ModService = ModServiceMock()

    @Bean
    fun gearModRepoMock(): GearModRepo = GearModRepoMock()
    @Bean
    fun skillModRepoMock(): SkillModRepo = SkillModRepoMock()
}