package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod

fun GearModEntity.toDomain(): GearMod {
    return GearMod(
        effect = effect,
        id = id,
        level = level,
        title = title,
        type = type
    )
}

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