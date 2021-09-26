package de.wz.divinv.domain

import de.wz.divinv.infrastructure.fromJson
import de.wz.divinv.infrastructure.toJson
import de.wz.divinv.testdata.DivinvTestData
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ApplicationDataModelTest : FunSpec({
    test("json converter") {
        val input = ApplicationDataModel(
            stammdaten = listOf(DivinvTestData.basicItemModel),
            inventory = listOf(DivinvTestData.basicItemModel)
        )
        val result = input.toJson().fromJson()
        result shouldBe input
    }
})