package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository


object ModTestData {
    val skillMod = SkillMod(
        id = 666,
        type = "test_type",
        slot = "test_slot",
        attribute = "test_attr",
        attribute_zusatz = "test_attr_zusatz",
        level = "999"
    )


    val gearMods: List<GearMod> = listOf()
    val skillMods: List<SkillMod> = listOf(skillMod)
}

class SkillModRepoMock() : SkillModRepo {
    override fun listAll(): List<SkillMod> {
        return ModTestData.skillMods
    }

}

class GearModRepoMock() : GearModRepo {
    override fun listAll(): List<GearMod> {
        return ModTestData.gearMods
    }
}