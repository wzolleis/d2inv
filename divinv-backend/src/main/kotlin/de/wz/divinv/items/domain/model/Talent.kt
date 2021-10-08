package de.wz.divinv.items.domain.model

data class Talent(
    val name: AppTypes.Name,
    val description: AppTypes.Description = AppTypes.Description("")) {
}