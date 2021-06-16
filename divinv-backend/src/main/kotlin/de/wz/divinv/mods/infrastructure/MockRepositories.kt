package de.wz.divinv.mods.infrastructure

import de.wz.divinv.mods.domain.model.SkillMod
import de.wz.divinv.mods.domain.SkillModType
import de.wz.divinv.mods.domain.repo.SkillModRepo


object ModTestData {
    private val skillMod = SkillMod(
        id = 666,
        type = SkillModType.OFFENSIVE,
        slot = "mock_test_slot",
        attribute = "test_attr",
        attribute_zusatz = "test_attr_zusatz",
        level = "999"
    )


    val skillMods: List<SkillMod> = listOf(skillMod)
}

class SkillModRepoMock() : SkillModRepo {
    override fun listAllSkillMod(): List<SkillMod> {
        return ModTestData.skillMods
    }

}