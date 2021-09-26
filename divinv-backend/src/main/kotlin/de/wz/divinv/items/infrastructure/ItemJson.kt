package de.wz.divinv.items.domain.model

import com.google.gson.Gson

fun ItemModel.toJson(): String {
    return Gson().toJson(this)
}

fun String.fromJson(): ItemModel? {
    return Gson().fromJson(this, ItemModel::class.java)
}

