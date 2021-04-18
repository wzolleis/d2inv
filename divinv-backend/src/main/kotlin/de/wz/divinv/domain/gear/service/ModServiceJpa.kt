package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.SkillModRepo

class ModServiceJpa(private val skillModRepo: SkillModRepo) : ModService {
    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAllSkillMod()
    }
}