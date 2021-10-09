package de.wz.divinv.items.domain.model

import kotlinx.serialization.Serializable

@Serializable
sealed class AppTypes {
    @Serializable
    data class Type(val value: String)

    @Serializable
    data class Name(val value: String)

    @Serializable
    data class Slot(val value: String)

    @Serializable
    data class AttributeName(val value: String)

    @Serializable
    data class AttributeValue(val value: String)

    @Serializable
    data class Variant(val value: String)

    @Serializable
    data class Description(val value: String)

    @Serializable
    data class WeaponAttribute(val value: String)

    @Serializable
    data class BrandName(val value: String)

    @Serializable
    data class ItemAttribute(val value: String)

    @Serializable
    data class DropZone(val value: String)
}