package de.wz.divinv.domain

import de.wz.divinv.items.domain.model.ItemModel

data class ApplicationDataModel(
    val stammdaten: List<ItemModel> = listOf(),
    val inventory: List<ItemModel> = listOf()
)