package de.wz.divinv.items.infrastructure

import de.wz.divinv.items.domain.model.Item
import de.wz.divinv.items.domain.repo.ItemRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

@Transactional
class ItemRepoJPA: ItemRepo {
    @Autowired
    lateinit var store: ItemStore

    override fun listAllItems(): List<Item> {
        TODO("Not yet implemented")
    }
}