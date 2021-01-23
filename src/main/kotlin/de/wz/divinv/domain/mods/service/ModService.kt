package de.wz.divinv.domain.mods.service

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo



interface ModService {
    fun listGearMods(): List<GearMod>
    fun listSkillMods(): List<SkillMod>
}