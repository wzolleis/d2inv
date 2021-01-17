package de.wz.divinv.domain.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod

interface GearModRepo {
    fun listAll(): List<GearMod>
}

interface SkillModRepo {
    fun listAll(): List<SkillMod>
}