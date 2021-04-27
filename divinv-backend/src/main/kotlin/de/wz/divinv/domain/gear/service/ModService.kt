package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.SkillMod


interface ModService {
    fun listSkillMods(): List<SkillMod>
}