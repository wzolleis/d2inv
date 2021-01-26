package de.wz.divinv.infrastructure.mods.repo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GearModStore : CrudRepository<GearModEntity, Long>

@Repository
interface SkillModStore : CrudRepository<SkillModEntity, Long> {
    fun findByType(type: String) : List<SkillModEntity>
}