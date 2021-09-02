package de.wz.divinv.items.infrastructure

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ItemStore : CrudRepository<ItemEntity, UUID>