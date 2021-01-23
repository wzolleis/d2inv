package de.wz.divinv.application.service

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.service.ModService

class ModServiceMock : ModService {
    override fun listGearMods(): List<GearMod> {
        return listOf()
    }

    override fun listSkillMods(): List<SkillMod> {
        return listOf()
    }
}