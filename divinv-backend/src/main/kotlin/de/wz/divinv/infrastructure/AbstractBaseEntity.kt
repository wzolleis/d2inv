package de.wz.divinv.infrastructure

import java.util.*

//@MappedSuperclass
abstract class AbstractBaseEntity(givenId: UUID? = null)
//    : Persistable<UUID>
{

//    @Id
//    @Column(name = "id", length = 16, unique = true, nullable = false)
//    private val id: UUID = givenId ?: UUID.randomUUID()
//
//    @Transient
//    private var persisted: Boolean = givenId != null
//
//    override fun getId(): UUID = id
//
//    override fun isNew(): Boolean = !persisted
//
//    override fun hashCode(): Int = id.hashCode()
//
//    override fun equals(other: Any?): Boolean {
//        return when {
//            this === other -> true
//            other == null -> false
//            other !is AbstractBaseEntity -> false
//            else -> getId() == other.getId()
//        }
//    }
//
//    @PostPersist
//    @PostLoad
//    private fun setPersisted() {
//        persisted = true
//    }
}