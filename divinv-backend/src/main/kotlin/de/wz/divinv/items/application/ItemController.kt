package de.wz.divinv.items.application

import de.wz.divinv.generated.api.ItemsApi
import de.wz.divinv.generated.model.Item
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


class ItemController: ItemsApi {
    override fun listItems(): ResponseEntity<List<Item>> {
        val items = listOf<Item>(Item("1"))
        return ResponseEntity(items, HttpStatus.OK)
    }
}