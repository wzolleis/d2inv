package de.wz.divinv.application.service

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import de.wz.divinv.domain.mods.service.ModService

class ModServiceMock(private val skillModRepo: SkillModRepo, private val gearModRepoMock: GearModRepo) : ModService {
    override fun listGearMods(): List<GearMod> {
        return gearModRepoMock.listAll()
    }

    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAll()
    }
}