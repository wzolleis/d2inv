package de.wz.divinv.application.controller

import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.model.SkillModList
import de.wz.divinv.domain.mods.service.ModService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ModsController(val modService: ModService) {

    @GetMapping(
        value = ["/modification"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun listSkillMods(): ResponseEntity<SkillModList> {
        val result = modService.listSkillMods()
        println(">>>>>>>>>>>>>>> $result")
        return ResponseEntity.ok(SkillModList(result))
    }
}