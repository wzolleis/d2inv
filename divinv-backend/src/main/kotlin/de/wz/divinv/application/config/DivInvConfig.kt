package de.wz.divinv.application.config

import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import de.wz.divinv.domain.mods.service.ModService
import de.wz.divinv.domain.mods.service.ModServiceJpa
import de.wz.divinv.infrastructure.mods.repo.GearModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.SkillModRepoJpa
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
class DivInvConfig {
    @Bean
    fun skillModRepo(): SkillModRepo = SkillModRepoJpa()

    @Bean
    fun gearModRepo(): GearModRepo = GearModRepoJpa()

    @Bean
    fun modService(): ModService = ModServiceJpa(gearModRepo(), skillModRepo())
}