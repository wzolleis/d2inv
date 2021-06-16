package de.wz.divinv.mods.infrastructure

import javax.persistence.*




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