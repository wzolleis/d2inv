package de.wz.divinv.infrastructure

import com.google.gson.Gson
import de.wz.divinv.domain.ApplicationDataModel

fun ApplicationDataModel.toJson(): String {
    return Gson().toJson(this)
}

fun String.fromJson(): ApplicationDataModel? {
    return Gson().fromJson(this, ApplicationDataModel::class.java)
}