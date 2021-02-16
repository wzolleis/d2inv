package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.gear.model.Gear
import de.wz.divinv.domain.gear.repo.GearRepo

class MockGearRepository : GearRepo {
    override fun ListAll(): List<Gear> {
        return listOf(gear)
    }

    companion object {
        val gear: Gear = Gear(
                name = "testGear",
                id = 1
        )
    }

}

