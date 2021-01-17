package de.wz.divinv.application.controller

import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.service.ModService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ModsController(val modService: ModService) {
    @GetMapping("/modification")
    fun listSkillMods(): ResponseEntity<List<SkillMod>> {
        return ResponseEntity.ok(modService.listSkillMods())
    }
}