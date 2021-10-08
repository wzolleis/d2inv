package de.wz.divinv.items.domain.model

sealed class AppTypes {
    data class Type(val value: String)
    data class Name(val value: String)
    data class Slot(val value: String)
    data class AttributeName(val value: String)
    data class AttributeValue(val value: String)
    data class Variant(val value: String)
    data class Description(val value: String)
    data class WeaponAttribute(val value: String)
    data class BrandName(val value: String)
    data class ItemAttribute(val value: String)
    data class DropZone(val value: String)
}