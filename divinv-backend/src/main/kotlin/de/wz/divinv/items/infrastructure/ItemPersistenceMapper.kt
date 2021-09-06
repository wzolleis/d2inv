package de.wz.divinv.items.infrastructure

import de.wz.divinv.items.domain.model.ItemId
import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.domain.model.toJson
import java.util.*

fun ItemEntity.toModel(): ItemModel {
    return ItemModel(id = ItemId(id.toString()), itemType = type)
}

fun ItemModel.toEntity(): ItemEntity {
    return ItemEntity(
        id = UUID.fromString(id.value),
        type = itemType,
        content = this.toJson()
    )
}