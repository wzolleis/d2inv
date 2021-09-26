package de.wz.divinv.testdata

import de.wz.divinv.items.domain.model.ItemId
import de.wz.divinv.items.domain.model.ItemModel

object DivinvTestData {
    val basicItemModel = ItemModel(
        id = ItemId("123"),
        itemType = "mod"
    )
}