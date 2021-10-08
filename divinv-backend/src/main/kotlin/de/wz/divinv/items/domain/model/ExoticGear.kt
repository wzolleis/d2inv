package de.wz.divinv.items.domain.model

import de.wz.divinv.items.domain.model.AppTypes.*

data class ExoticGear(
    val type: Type,
    val name: Name,
    val talents: List<Talent> = emptyList(),
    val attributes: List<WeaponAttribute>,
    val mods: WeaponMods
)
