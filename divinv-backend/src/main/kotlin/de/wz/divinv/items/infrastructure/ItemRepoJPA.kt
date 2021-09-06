package de.wz.divinv.items.infrastructure

import de.wz.divinv.generated.model.Item
import de.wz.divinv.items.domain.model.ItemId
import de.wz.divinv.items.domain.model.ItemModel
import de.wz.divinv.items.domain.model.toJson
import de.wz.divinv.items.domain.repo.ItemRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Transactional
class ItemRepoJPA() : ItemRepo {
    @Autowired
    lateinit var store: ItemStore

    override fun listAllItems(): List<ItemModel> {
        return store.findAll().map { it.toModel() }
    }

    override fun createItem(item: ItemModel) {
        store.save(item.toEntity())
    }


}