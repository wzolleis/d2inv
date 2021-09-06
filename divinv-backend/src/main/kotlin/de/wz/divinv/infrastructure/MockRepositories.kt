package de.wz.divinv.infrastructure

import de.wz.divinv.generated.model.Item
import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.domain.repo.ItemRepo


class ItemRepoMock : ItemRepo {
    val data: MutableList<ItemModel> = mutableListOf()
    override fun listAllItems(): List<ItemModel> {
        return data
    }

    override fun createItem(item: ItemModel) {
        when (data.any { it.id == item.id }) {
            false -> data.add(item)
            true -> data.replace(item) { it.id == item.id }
        }
    }

    fun <T> List<T>.replace(newValue: T, block: (T) -> Boolean): List<T> {
        return map {
            if (block(it)) newValue else it
        }
    }
}