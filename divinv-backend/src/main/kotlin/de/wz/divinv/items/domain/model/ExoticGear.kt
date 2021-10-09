package de.wz.divinv.items.domain.model

import de.wz.divinv.items.domain.model.AppTypes.*
import kotlinx.serialization.Serializable

@Serializable
data class ExoticGear(
    val type: Type,
    val name: Name,
    val talents: List<Talent> = emptyList(),
    val attributes: List<WeaponAttribute> = emptyList(),
    val mods: WeaponMods
)
