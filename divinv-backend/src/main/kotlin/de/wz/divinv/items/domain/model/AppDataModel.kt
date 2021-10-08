package de.wz.divinv.items.domain.model

typealias ItemAttributes = Map<String, String>

data class AppDataModel(
    val exoticGear: ExoticGearModel,
    val namedItems: NamedItemModel,
    val nameddWeapons: NamedWeaponModel,
    val skillMods: SkillModModel
)