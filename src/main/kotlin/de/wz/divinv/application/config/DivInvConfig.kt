package de.wz.divinv.application.config

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import de.wz.divinv.domain.mods.service.ModService
import de.wz.divinv.infrastructure.mods.repo.GearModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.GearModStore
import de.wz.divinv.infrastructure.mods.repo.SkillModRepoJpa
import de.wz.divinv.infrastructure.mods.repo.SkillModStore
import de.wz.divinv.infrastructure.repo.GearModRepoMock
import de.wz.divinv.infrastructure.repo.SkillModRepoMock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter

@Configuration
class DivInvConfig {
    @Autowired
    lateinit var gearModStore: GearModStore;
    lateinit var skillModStore: SkillModStore

    @Profile("!test")
    @Bean
    fun skillModRepo(): SkillModRepo = SkillModRepoJpa(skillModStore)

    @Profile("test")
    @Bean
    fun skillModRepoMock(): SkillModRepo = SkillModRepoMock()

    @Profile("test")
    @Bean
    fun gearModRepoMock(): GearModRepo = GearModRepoMock()

    @Profile("!test")
    @Bean
    fun gearModRepo(): GearModRepo = GearModRepoJpa(gearModStore)

    @Bean
    fun modService() =
        ModService(gearModRepo(), skillModRepo())
}