package de.wz.divinv.infrastructure.mods.repo

import de.wz.divinv.domain.gear.model.SkillMod
import de.wz.divinv.domain.gear.repo.SkillModRepo
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



