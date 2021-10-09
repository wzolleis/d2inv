package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class AppDataModel(
    val exoticGear: ExoticGearModel,
    val namedItems: NamedItemModel,
    val nameddWeapons: NamedWeaponModel,
    val skillMods: SkillModModel
)