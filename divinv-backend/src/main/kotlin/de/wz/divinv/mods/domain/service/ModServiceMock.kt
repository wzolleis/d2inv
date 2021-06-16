package de.wz.divinv.mods.domain.service

import de.wz.divinv.mods.domain.model.SkillMod
import de.wz.divinv.mods.domain.repo.SkillModRepo

class ModServiceMock(private val skillModRepo: SkillModRepo) : ModService {
    override fun listSkillMods(): List<SkillMod> {
        return skillModRepo.listAllSkillMod()
    }
}