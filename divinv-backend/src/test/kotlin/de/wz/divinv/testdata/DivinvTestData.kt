package de.wz.divinv.testdata

import de.wz.divinv.items.domain.model.*
import de.wz.divinv.items.domain.model.AppTypes.*

object DivinvTestData {
    val applicationData: AppDataModel =
        AppDataModel(
            exoticGear = ExoticGearModel(
                listOf(
                    ExoticGear(
                        type = "Assault Rifle",
                        name = "The Bighorn",
                        talents = listOf(
                            Talent(
                                name = "Big Game Hunter",
                                description = """|When scoped, switches to semi-automatic-fire mode,
                                   |dealing 450% weapon damage with each shot.
                                   |""".oneline()
                            )
                        ),
                        attributes = listOf(
                            "Assault Rifle Damage",
                            "Health Damage",
                            "Critical Hit Damage"
                        ),
                        mods = WeaponMods(
                            optics = "+30% Headshot Damage",
                            magazine = "+10% Reload Speed",
                            underbarrel = "+10% Stability",
                            muzzle = "10% Accuracy"
                        )
                    )
                ),
            ),
            namedItems = NamedItemModel(
                listOf()
            ),
            nameddWeapons = NamedWeaponModel(
                listOf()
            ),
            skillMods = SkillModModel(
                listOf()
            ),
        )
}

fun String.oneline(): String {
    return trimMargin().replace("\n", "")
}