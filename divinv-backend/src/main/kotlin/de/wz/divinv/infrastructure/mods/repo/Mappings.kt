package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.model.SkillModType
import java.lang.IllegalArgumentException

fun SkillModEntity.toDomain(): SkillMod {
    return SkillMod(
        id = id,
        type = mapSkillModType(type),
        slot = slot,
        attribute = attribute,
        attribute_zusatz = attribute_zusatz,
        level = level,
    )

}

fun mapSkillModType(type: String): SkillModType {
    return when(type) {
        "offensive" -> SkillModType.OFFENSIVE
        "defensive" -> SkillModType.DEFENSIVE
        "utility" -> SkillModType.UTILITY
        else -> throw IllegalArgumentException("unbekannter skill mod mit Typ $type")
    }
}
