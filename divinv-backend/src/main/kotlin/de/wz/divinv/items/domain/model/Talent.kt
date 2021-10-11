package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Talent(
    val name: String,
    val description: String = ""
)