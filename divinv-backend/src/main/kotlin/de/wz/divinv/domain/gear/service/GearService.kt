package de.wz.divinv.domain.gear.service

import de.wz.divinv.domain.gear.model.Gear
import de.wz.divinv.domain.gear.repo.GearRepo

open class GearService(val gearRepo: GearRepo) {
    fun listAll(): List<Gear> = gearRepo.ListAll()
}