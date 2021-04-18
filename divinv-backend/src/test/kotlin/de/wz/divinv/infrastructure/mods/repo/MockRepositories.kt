package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.SkillModRepo


object ModTestData {
    private val skillMod = SkillMod(
        id = 666,
        type = "test_type",
        slot = "test_slot",
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