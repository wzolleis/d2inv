package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.skillmods.domain.model.SkillMod
import de.wz.divinv.skillmods.domain.SkillModType
import de.wz.divinv.skillmods.infrastructure.SkillModEntity
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
