package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.GearMod
import de.wz.divinv.domain.gear.model.SkillMod


interface ModService {
    fun listGearMods(): List<GearMod>
    fun listSkillMods(): List<SkillMod>
}