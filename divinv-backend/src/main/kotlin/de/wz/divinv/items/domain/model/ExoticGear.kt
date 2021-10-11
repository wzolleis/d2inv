package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ExoticGear(
    val type: String,
    val name: String,
    val talents: List<Talent> = emptyList(),
    val attributes: List<String> = emptyList(),
    val mods: WeaponMods
)
