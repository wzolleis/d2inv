package de.wz.divinv.domain.mods.model

class GearMod(
    val id: Long? = null,
    var title: String,
    var type: String,
    var effect: String,
    var level: String,
)

class SkillMod(
    val id: Long? = null,
    var type: String,
    var slot: String,
    var attribute: String,
    var attribute_zusatz: String,
    var level: String,
    )