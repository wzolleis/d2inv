package de.wz.divinv.skillmods.domain.service

import de.wz.divinv.skillmods.domain.model.SkillMod
import de.wz.divinv.skillmods.domain.repo.SkillModRepo

class ModServiceJpa(private val skillModRepo: SkillModRepo) : ModService {
    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAllSkillMod()
    }
}