package de.wz.divinv.infrastructure

import de.wz.divinv.testdata.DivinvTestData.applicationData
import io.kotest.core.spec.style.StringSpec
import kotlinx.serialization.json.Json

class AppDataSerializationTest: StringSpec() {
    init {
        "serialize application data" {
            println(Json.encodeToString(applicationData))
        }
    }
}