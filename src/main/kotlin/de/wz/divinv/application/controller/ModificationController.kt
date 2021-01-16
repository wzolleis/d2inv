package de.wz.divinv.application.controller

import de.wz.divinv.domain.mods.Modification
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ModificationController {
    @GetMapping("/modification")
    fun list(): ResponseEntity<List<Modification>> {
        return ResponseEntity.ok(listOf(Modification("test")))
    }
}