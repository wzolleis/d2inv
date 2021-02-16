package de.wz.divinv.application.config

import de.wz.divinv.domain.gear.repo.GearModRepo
import de.wz.divinv.domain.gear.repo.GearRepo
import de.wz.divinv.domain.gear.repo.SkillModRepo
import de.wz.divinv.domain.gear.service.GearService
import de.wz.divinv.domain.gear.service.ModService
import de.wz.divinv.domain.gear.service.ModServiceJpa
import de.wz.divinv.infrastructure.mods.repo.GearModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.MockGearRepository
import de.wz.divinv.infrastructure.mods.repo.SkillModRepoJpa
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
open class DivInvConfig {
    @Bean
    open fun skillModRepo(): SkillModRepo = SkillModRepoJpa()

    @Bean
    open fun gearModRepo(): GearModRepo = GearModRepoJpa()

    @Bean
    open fun modService(): ModService = ModServiceJpa(gearModRepo(), skillModRepo())

    @Bean
    open fun gearRepo(): GearRepo = MockGearRepository()

    @Bean
    open fun gearService(): GearService = GearService(gearRepo())
}