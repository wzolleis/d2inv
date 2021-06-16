package de.wz.divinv.mods.domain.model

import de.wz.divinv.mods.domain.SkillModType
import kotlinx.serialization.Serializable

@Serializable
data class SkillMod(
    val id: Long? = null,
    var type: SkillModType,
    var slot: String = "",
    var attribute: String = "",
    var attribute_zusatz: String = "",
    var level: String = "",
)

@Serializable
data class SkillModList(var skillMods: List<SkillMod> = listOf())