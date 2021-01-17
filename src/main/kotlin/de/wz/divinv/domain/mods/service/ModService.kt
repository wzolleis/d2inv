package de.wz.divinv.domain.mods.service

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo

class ModService(val gearModRepo: GearModRepo, val skillModRepo: SkillModRepo) {
    fun listGearMods(): List<GearMod> = gearModRepo.listAll()

    fun listSkillMods(): List<SkillMod> = skillModRepo.listAll()
}