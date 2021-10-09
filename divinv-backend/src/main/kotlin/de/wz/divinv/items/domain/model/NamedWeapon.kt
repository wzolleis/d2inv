package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class NamedWeapon(
    val type: AppTypes.Type,
    val name: AppTypes.Name,
    val variant: AppTypes.Variant,
    val talent: Talent,
    val dropZone: AppTypes.DropZone
)
