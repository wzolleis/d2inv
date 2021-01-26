package de.wz.divinv.infrastructure.mods.repo

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

@Entity
@Table(name = "SKILL_MOD")
class SkillModEntity (
    val type: String,
    val slot: String,
    val attribute: String,
    val attribute_zusatz: String,
    val level: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long
)