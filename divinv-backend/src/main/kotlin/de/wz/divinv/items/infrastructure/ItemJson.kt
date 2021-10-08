package de.wz.divinv.items.infrastructure

import com.google.gson.Gson
import de.wz.divinv.items.domain.model.ItemModel

fun ItemModel.toJson(): String {
    return Gson().toJson(this)
}

fun String.fromJson(): ItemModel? {
    return Gson().fromJson(this, ItemModel::class.java)
}

