package ru.nsu.fit.reflex.project_management.core.service

interface ImageService {
    fun getImageByName(name: String): ByteArray

    fun addImageByName(name: String, image: ByteArray)
}