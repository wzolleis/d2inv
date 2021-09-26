package de.wz.divinv.items.infrastructure

import java.util.*

/**
 * Items mit UUID: https://jivimberg.io/blog/2018/11/05/using-uuid-on-spring-data-jpa-entities/
 */

//@Entity
//@Table(name = "items")
class ItemEntity(
    id: UUID?,
    val type: String,
    val content: String
)
//) : AbstractBaseEntity(id)
