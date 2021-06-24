package de.wz.divinv.skillmods.domain.service

import de.wz.divinv.skillmods.domain.model.SkillMod


interface ModService {
    fun listSkillMods(): List<SkillMod>
}