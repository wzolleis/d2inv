package de.wz.divinv.domain.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Repository

@Profile("!test")
@Repository
interface GearModRepo {
    fun listAll(): List<GearMod>
}

@Profile("!test")
@Repository
interface SkillModRepo {
    fun listAll(): List<SkillMod>
}