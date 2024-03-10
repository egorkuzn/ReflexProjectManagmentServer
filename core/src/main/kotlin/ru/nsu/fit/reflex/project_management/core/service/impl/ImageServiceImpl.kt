package ru.nsu.fit.reflex.project_management.core.service.impl

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import ru.nsu.fit.reflex.project_management.core.model.entity.ImageEntity
import ru.nsu.fit.reflex.project_management.core.repo.ImageRepo
import ru.nsu.fit.reflex.project_management.core.service.ImageService

@Service
class ImageServiceImpl(private val imageRepo: ImageRepo) : ImageService {
    @Transactional
    override fun getImageByName(name: String) = imageRepo.findFirstByName(name).image

    override fun addImageByName(name: String, image: ByteArray) {
        imageRepo.save(ImageEntity(name, image))
    }
}