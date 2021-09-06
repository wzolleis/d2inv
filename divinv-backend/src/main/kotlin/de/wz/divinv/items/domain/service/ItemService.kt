package de.wz.divinv.items.domain.service

import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.domain.repo.ItemRepo

class ItemService(private val itemRepo: ItemRepo) {
    fun listItems(): List<ItemModel> {
        return itemRepo.listAllItems()
    }

    fun createItem(item: ItemModel) {
        itemRepo.createItem(item)
    }
}