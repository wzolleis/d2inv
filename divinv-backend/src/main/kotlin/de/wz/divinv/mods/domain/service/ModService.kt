package de.wz.divinv.mods.domain.service

import de.wz.divinv.mods.domain.model.SkillMod


interface ModService {
    fun listSkillMods(): List<SkillMod>
}