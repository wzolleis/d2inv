package de.wz.divinv.items.domain.repo

import de.wz.divinv.generated.model.Item
import de.wz.divinv.items.domain.model.ItemModel
import org.springframework.stereotype.Repository

@Repository
interface ItemRepo {
    fun listAllItems(): List<ItemModel>
    fun createItem(item: ItemModel)
}