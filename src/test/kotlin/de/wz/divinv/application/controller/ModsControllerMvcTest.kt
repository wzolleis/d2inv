package de.wz.divinv.application.controller

import de.wz.divinv.application.app.DivinvAppApplication
import de.wz.divinv.domain.mods.model.SkillModList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import org.springframework.test.context.ActiveProfiles


@ActiveProfiles("local", "test")
@SpringBootTest(
    classes = [DivinvAppApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class ModsControllerMvcTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `list skill mods`() {
        val response: SkillModList? = restTemplate.getForObject("/modification")
        assertThat(response?.skillMods).isNotNull
    }
}