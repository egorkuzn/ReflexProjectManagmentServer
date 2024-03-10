package ru.nsu.fit.reflex.project_management.core.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.nsu.fit.reflex.project_management.core.model.entity.ImageEntity

@Repository
interface ImageRepo: JpaRepository<ImageEntity, String> {
    fun findFirstByName(name: String): ImageEntity
}