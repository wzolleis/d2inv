package de.wz.divinv.items.infrastructure

import de.wz.divinv.infrastructure.RepoFile
import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.domain.repo.ItemRepo

class ItemRepoJson(val repoFile: RepoFile) : ItemRepo {

    override fun listAllItems(): List<ItemModel> {
        TODO("Not yet implemented")
    }

    override fun createItem(item: ItemModel) {
        TODO("Not yet implemented")
    }
}