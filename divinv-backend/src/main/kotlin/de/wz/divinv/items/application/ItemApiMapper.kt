package de.wz.divinv.items.application

import de.wz.divinv.generated.model.Item
import de.wz.divinv.items.domain.model.ItemId
import de.wz.divinv.items.domain.model.ItemModel

fun Item.toModel(): ItemModel {
    return ItemModel(
        id = ItemId(this.id),
        itemType = this.itemType
    )
}

fun ItemModel.toApi(): Item {
    return Item(
        id = this.id.value,
        itemType = this.itemType
    )
}