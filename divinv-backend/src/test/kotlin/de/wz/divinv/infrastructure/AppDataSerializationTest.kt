package de.wz.divinv.infrastructure

import de.wz.divinv.items.domain.model.AppDataModel
import de.wz.divinv.testdata.DivinvTestData.applicationData
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class AppDataSerializationTest: StringSpec() {
    init {
        "serialize application data" {
            val json = Json.encodeToString(applicationData)
            val model: AppDataModel = Json.decodeFromString(json)
            model shouldBe applicationData
            println(Json.encodeToString(applicationData))
        }
    }
}