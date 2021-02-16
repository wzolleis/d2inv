package de.wz.divinv.application.service

import de.wz.divinv.domain.gear.model.GearMod
import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.GearModRepo
import de.wz.divinv.domain.gear.repo.SkillModRepo
import de.wz.divinv.domain.gear.service.ModService

class ModServiceMock(private val skillModRepo: SkillModRepo, private val gearModRepoMock: GearModRepo) : ModService {
    override fun listGearMods(): List<GearMod> {
        return gearModRepoMock.listAll()
    }

    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAll()
    }
}