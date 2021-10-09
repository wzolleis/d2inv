package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Talent(
    val name: AppTypes.Name,
    val description: AppTypes.Description = AppTypes.Description("")) {
}