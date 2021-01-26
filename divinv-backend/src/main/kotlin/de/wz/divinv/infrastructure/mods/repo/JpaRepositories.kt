package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.mods.model.GearMod
import de.wz.divinv.domain.mods.model.SkillMod
import de.wz.divinv.domain.mods.repo.GearModRepo
import de.wz.divinv.domain.mods.repo.SkillModRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

@Transactional
class SkillModRepoJpa: SkillModRepo {
    @Autowired
    lateinit var store: SkillModStore

    override fun listAll(): List<SkillMod> {
        return store.findAll().map(SkillModEntity::toDomain)
    }

}

@Transactional
class GearModRepoJpa() : GearModRepo {
    @Autowired
    lateinit var store: GearModStore

    override fun listAll(): List<GearMod> {
        return store.findAll().map(GearModEntity::toDomain)
    }
}

