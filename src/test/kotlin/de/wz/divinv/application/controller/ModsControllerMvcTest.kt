package de.wz.divinv.application.controller

import de.wz.divinv.DivinvAppApplication
import de.wz.divinv.application.config.DivInvConfig
import de.wz.divinv.application.config.DivInvTestConfig
import de.wz.divinv.domain.mods.service.ModService
import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.Description
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf
import io.kotest.spring.SpringListener
import org.mockito.MockitoAnnotations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup
import org.springframework.web.context.WebApplicationContext
import org.springframework.mock.web.MockServletContext

import javax.servlet.ServletContext




@ActiveProfiles("local", "test")
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.MOCK,
    classes = [DivinvAppApplication::class, DivInvConfig::class] //, DivInvTestConfig::class
)
@AutoConfigureMockMvc
@TestPropertySource(locations = ["/application.properties", "/application-local.properties"])
class ModsControllerMvcTest : StringSpec() {
    override fun listeners() = listOf(SpringListener)

    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var wac: WebApplicationContext

    @MockBean
    private lateinit var modService: ModService

    override fun beforeEach(testCase: TestCase) {
        super.beforeEach(testCase)
        mockMvc = webAppContextSetup(wac).build()
    }

    init {
        "list skill mods" {
            val servletContext = wac.servletContext

            servletContext shouldNotBe null
            servletContext.shouldBeInstanceOf<MockServletContext>()
            wac.getBean("modsController") shouldNotBe null

            mockMvc.get("/api/modification") {
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