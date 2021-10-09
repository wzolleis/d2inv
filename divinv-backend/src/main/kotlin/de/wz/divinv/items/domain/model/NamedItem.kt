package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class NamedItem(
  val type: AppTypes.Type,
  val brandName: AppTypes.BrandName,
  val name: AppTypes.Name,
  val core: AppTypes.ItemAttribute,
  val uniqueAttribute: AppTypes.ItemAttribute,
  val talent: Talent,
  val dropZone: AppTypes.DropZone
)