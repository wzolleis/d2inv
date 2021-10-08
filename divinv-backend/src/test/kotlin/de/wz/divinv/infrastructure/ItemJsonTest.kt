package de.wz.divinv.infrastructure

import de.wz.divinv.items.domain.model.ItemId
import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.infrastructure.fromJson
import de.wz.divinv.items.infrastructure.toJson
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class ItemJsonTest : FunSpec({

    test("json converter") {
        val itemModel = ItemModel(id = ItemId("item-1"), itemType = "MOD")
        val result = itemModel.toJson().fromJson()
        result shouldBe itemModel


    }
})