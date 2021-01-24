package de.wz.divinv.application.controller

import com.ninjasquad.springmockk.MockkBean
import de.wz.divinv.domain.mods.model.SkillModList
import de.wz.divinv.domain.mods.service.ModService
import de.wz.divinv.infrastructure.mods.repo.ModTestData
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.spring.SpringListener
import io.mockk.every
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.get

//@ExtendWith(SpringExtension::class)
@WebMvcTest(ModController::class)
class ModsControllerSpecTest : StringSpec() {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockkBean
    private lateinit var modService: ModService

    override fun listeners() = listOf(SpringListener)

    init {
        "list skill mods" {
            every { modService.listSkillMods() } returns ModTestData.skillMods

            val result: MvcResult = mockMvc.get("/api/modification") {
                contentType = MediaType.APPLICATION_JSON
                content = null
                accept = MediaType.APPLICATION_JSON
            }.andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
            }.andReturn()

            val json = Json {encodeDefaults = false}
            val content: String = result.response.contentAsString
            val obj = json.decodeFromString<SkillModList>(string = content)
            obj.skillMods shouldContainExactlyInAnyOrder ModTestData.skillMods
        }
    }
}