package de.wz.divinv.application.controller

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.model.SkillModList
import de.wz.divinv.domain.gear.service.ModService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ModController(val modService: ModService) {

    @GetMapping(
        value = ["/api/modification"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun listSkillMods(): ResponseEntity<SkillModList> {
        val result = modService.listSkillMods()

        val responseMock = listOf(
            SkillMod(
                id = 666,
                type = "test_type",
                slot = "test_slot",
                attribute = "test_attr",
                attribute_zusatz = "test_attr_zusatz",
                level = "999"
            )
        )

        return ResponseEntity.ok(SkillModList(responseMock))
    }
}