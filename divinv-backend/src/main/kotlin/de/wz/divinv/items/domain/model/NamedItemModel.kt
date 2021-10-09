package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class NamedItemModel(
    val data: List<NamedItem>
)