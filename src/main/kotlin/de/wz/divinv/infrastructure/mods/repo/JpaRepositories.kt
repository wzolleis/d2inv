package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo

class SkillModRepoJpa(val store: SkillModStore) : SkillModRepo {
    override fun listAll(): List<SkillMod> {
        return store.findAll().map(SkillModEntity::toDomain)
    }

}

class GearModRepoJpa(private val store: GearModStore) : GearModRepo {
    override fun listAll(): List<GearMod> {
        return store.findAll().map(GearModEntity::toDomain)
    }
}

