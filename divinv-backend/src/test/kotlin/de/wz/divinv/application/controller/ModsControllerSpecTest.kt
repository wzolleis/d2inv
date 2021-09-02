package de.wz.divinv.application.controller

import io.kotest.core.spec.style.StringSpec

//@ExtendWith(SpringExtension::class)
//@WebMvcTest(ModController::class)
class ModsControllerSpecTest : StringSpec() {
//    @Autowired
//    private lateinit var mockMvc: MockMvc
//
//    @MockkBean
//    private lateinit var modService: ModService
//
//    override fun listeners() = listOf(SpringListener)
//
//    init {
//        "list skill mods" {
//            every { modService.listSkillMods() } returns ModTestData.skillMods
//
//            val result: MvcResult = mockMvc.get("/api/modification") {
//                contentType = MediaType.APPLICATION_JSON
//                content = null
//                accept = MediaType.APPLICATION_JSON
//            }.andExpect {
//                status { isOk() }
//                content { contentType(MediaType.APPLICATION_JSON) }
//            }.andReturn()
//
//            val json = Json {encodeDefaults = false}
//            val content: String = result.response.contentAsString
//            val obj = json.decodeFromString<SkillModList>(string = content)
//            obj.skillMods shouldContainExactlyInAnyOrder ModTestData.skillMods
//        }
//    }
}