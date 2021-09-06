package de.wz.divinv.items.application

import de.wz.divinv.generated.api.ItemsApi
import de.wz.divinv.generated.model.Item
import de.wz.divinv.items.domain.service.ItemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody


class ItemController(private val itemService: ItemService) : ItemsApi {
    override fun createItem(@RequestBody item: Item?): ResponseEntity<Unit> {
        return item?.let {
            itemService.createItem(item.toModel())
            ResponseEntity.ok().build()
        } ?: ResponseEntity.badRequest().build()
    }

    override fun listItems(): ResponseEntity<List<Item>> {
        val items = itemService.listItems().map { it.toApi() }
        return ResponseEntity(items, HttpStatus.OK)
    }
}