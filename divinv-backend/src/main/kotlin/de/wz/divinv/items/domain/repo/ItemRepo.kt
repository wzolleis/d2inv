package de.wz.divinv.items.domain.repo

import de.wz.divinv.items.domain.model.Item
import org.springframework.stereotype.Repository

@Repository
interface ItemRepo {
    fun listAllItems(): List<Item>
}