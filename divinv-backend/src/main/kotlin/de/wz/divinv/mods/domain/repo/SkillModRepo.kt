package de.wz.divinv.mods.domain.repo

import de.wz.divinv.mods.domain.model.SkillMod
import org.springframework.stereotype.Repository

@Repository
interface SkillModRepo {
    fun listAllSkillMod(): List<SkillMod>
}

