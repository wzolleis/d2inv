package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.gear.model.SkillMod

fun SkillModEntity.toDomain(): SkillMod {
    return SkillMod(
        id = id,
        type = type,
        slot = slot,
        attribute = attribute,
        attribute_zusatz = attribute_zusatz,
        level = level,

    )
}