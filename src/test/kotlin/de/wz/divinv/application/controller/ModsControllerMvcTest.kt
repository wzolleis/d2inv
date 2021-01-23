package de.wz.divinv.application.controller

import de.wz.divinv.DivinvAppApplication
import de.wz.divinv.application.config.DivInvConfig
import de.wz.divinv.application.config.DivInvTestConfig
import io.kotest.core.spec.style.StringSpec
import io.kotest.spring.SpringListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@ActiveProfiles("local", "test")
@SpringBootTest(classes = [DivinvAppApplication::class, DivInvConfig::class, DivInvTestConfig::class])
@AutoConfigureMockMvc
@TestPropertySource(locations = ["/application.properties", "/application-local.properties"])
class ModsControllerMvcTest : StringSpec() {
    override fun listeners() = listOf(SpringListener)

    @Autowired
    lateinit var mockMvc: MockMvc

//    @Autowired
//    lateinit var objectMapper: ObjectMapper

    init {
        "list skill mods" {
            mockMvc.get("http://localhost:8080/modification") {
                contentType = MediaType.APPLICATION_JSON
                content = null // objectMapper.writeValueAsString(Request(Name("admin", "")))
                accept = MediaType.APPLICATION_JSON
            }.andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                content { json("{}") }
            }
        }
    }
}