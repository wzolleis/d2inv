package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.GearMod
import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.GearModRepo
import de.wz.divinv.domain.gear.repo.SkillModRepo

class ModServiceJpa(private val gearModRepo: GearModRepo, private val skillModRepo: SkillModRepo) : ModService {
    override fun listGearMods(): List<GearMod> = gearModRepo.listAll()

    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAll()
    }
}