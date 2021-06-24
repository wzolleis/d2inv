package de.wz.divinv.gearmods.infrastructure

import javax.persistence.*

@Entity
@Table(name = "GEAR_MOD")
class GearModEntity (
    val title: String,
    val type: String,
    val effect: String,
    val level: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long
)