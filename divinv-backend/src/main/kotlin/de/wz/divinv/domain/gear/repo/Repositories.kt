package de.wz.divinv.domain.gear.repo

import de.wz.divinv.domain.gear.model.Gear
import de.wz.divinv.domain.gear.model.GearMod
import de.wz.divinv.domain.gear.model.SkillMod
import org.springframework.stereotype.Repository

@Repository
interface GearModRepo {
    fun listAll(): List<GearMod>
}

@Repository
interface SkillModRepo {
    fun listAll(): List<SkillMod>
}

interface GearRepo {
    fun ListAll(): List<Gear>
}