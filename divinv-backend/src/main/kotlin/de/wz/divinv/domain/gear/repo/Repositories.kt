package de.wz.divinv.domain.gear.repo

import de.wz.divinv.domain.gear.model.SkillMod
import org.springframework.stereotype.Repository

@Repository
interface SkillModRepo {
    fun listAllSkillMod(): List<SkillMod>
}

