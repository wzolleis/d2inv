package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class WeaponMods(
    val optics: String,
    val magazine: String,
    val underbarrel: String,
    val muzzle: String
)
