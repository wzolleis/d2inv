package de.wz.divinv.items.domain.repo

import de.wz.divinv.items.domain.model.AppDataModel

interface AppRepo {
    fun read(): AppDataModel
    fun save(dataModel: AppDataModel)
}