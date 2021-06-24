package de.wz.divinv.application.config

import de.wz.divinv.skillmods.domain.repo.SkillModRepo
import de.wz.divinv.skillmods.domain.service.ModService
import de.wz.divinv.skillmods.domain.service.ModServiceJpa
import de.wz.divinv.skillmods.infrastructure.SkillModRepoJpa
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!test")
open class DivInvConfig {
    @Bean
    open fun skillModRepo(): SkillModRepo = SkillModRepoJpa()

    @Bean
    open fun modService(): ModService = ModServiceJpa(skillModRepo())

}