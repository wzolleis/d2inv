package de.wz.divinv.items.infrastructure

import de.wz.divinv.items.domain.model.Item
import de.wz.divinv.items.domain.repo.ItemRepo


class ItemRepoMock : ItemRepo {
    override fun listAllItems(): List<Item> {
        return emptyList()
    }
}