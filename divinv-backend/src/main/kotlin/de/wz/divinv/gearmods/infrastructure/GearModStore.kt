package de.wz.divinv.gearmods.infrastructure

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GearModStore : CrudRepository<GearModEntity, Long>