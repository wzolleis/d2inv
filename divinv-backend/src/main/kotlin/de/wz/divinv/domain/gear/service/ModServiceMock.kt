package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.SkillModRepo
import de.wz.divinv.domain.gear.service.ModService

class ModServiceMock(private val skillModRepo: SkillModRepo) : ModService {
    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAllSkillMod()
    }
}