package de.wz.divinv.skillmods.domain.repo

import de.wz.divinv.skillmods.domain.model.SkillMod
import org.springframework.stereotype.Repository

@Repository
interface SkillModRepo {
    fun listAllSkillMod(): List<SkillMod>
}

