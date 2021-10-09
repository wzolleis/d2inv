package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class SkillMod(
    val name: AppTypes.Name,
    val slot: AppTypes.Slot,
    val attribute: AppTypes.AttributeName,
    val maxLvl40: AppTypes.AttributeValue
)
