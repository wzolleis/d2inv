package de.wz.divinv.skillmods.infrastructure

import de.wz.divinv.skillmods.domain.model.SkillMod
import de.wz.divinv.skillmods.domain.repo.SkillModRepo
import de.wz.divinv.infrastructure.mods.repo.toDomain
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

@Transactional
class SkillModRepoJpa: SkillModRepo {
    @Autowired
    lateinit var store: SkillModStore

    override fun listAllSkillMod(): List<SkillMod> {
        return store.findAll().map(SkillModEntity::toDomain)
    }

}



