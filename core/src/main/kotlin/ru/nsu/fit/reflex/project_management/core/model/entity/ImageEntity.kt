package ru.nsu.fit.reflex.project_management.core.model.entity

import jakarta.persistence.*

@Table(name = "image")
@Entity
data class ImageEntity(
    @Id
    val name: String,
    @Lob
    @Basic(fetch=FetchType.LAZY)
    val image: ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ImageEntity

        return name == other.name
    }

    override fun hashCode() = name.hashCode()
}