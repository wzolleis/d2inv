package de.wz.divinv.application.config

import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import de.wz.divinv.domain.mods.service.ModService
import de.wz.divinv.infrastructure.mods.repo.GearModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.GearModStore
import de.wz.divinv.infrastructure.mods.repo.SkillModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.SkillModStore
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DivInvConfig {
    @Bean
    fun skillModRepo(store: SkillModStore): SkillModRepo = SkillModRepoJpa(store)

    @Bean
    fun gearModRepo(store: GearModStore): GearModRepo = GearModRepoJpa(store)

    @Bean
    fun modService(gearModStore: GearModStore, skillModStore: SkillModStore) =
        ModService(gearModRepo(gearModStore), skillModRepo(skillModStore))
}