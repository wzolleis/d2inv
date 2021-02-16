package de.wz.divinv.domain.gear.model

import kotlinx.serialization.Serializable

@Serializable
data class GearMod(
    val id: Long? = null,
    var title: String = "",
    var type: String = "",
    var effect: String = "",
    var level: String = "",
)

@Serializable
data class GearModList(var skillMods: List<GearMod> = listOf())