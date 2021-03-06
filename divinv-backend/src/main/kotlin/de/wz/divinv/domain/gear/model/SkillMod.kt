package de.wz.divinv.domain.gear.model

import kotlinx.serialization.Serializable

@Serializable
data class SkillMod(
val id: Long? = null,
var type: String = "",
var slot: String = "",
var attribute: String = "",
var attribute_zusatz: String = "",
var level: String = "",
)

@Serializable
data class SkillModList(var skillMods: List<SkillMod> = listOf())