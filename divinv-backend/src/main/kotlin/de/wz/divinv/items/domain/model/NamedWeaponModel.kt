package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class NamedWeaponModel(
    val data: List<NamedWeapon>
)
