package de.wz.divinv.mods.infrastructure

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SkillModStore : CrudRepository<SkillModEntity, Long> {
    fun findByType(type: String) : List<SkillModEntity>
}