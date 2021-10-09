package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class SkillModModel(
    val skillMods: List<SkillMod>
)
