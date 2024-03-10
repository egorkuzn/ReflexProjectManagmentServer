package ru.nsu.fit.reflex.project_management.core.controller

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.nsu.fit.reflex.project_management.core.service.ImageService

@RestController
class Controller(private val imageService: ImageService) {
    @GetMapping("/image/{name}")
    fun getImageByName(@PathVariable name: String) = ResponseEntity.ok()
        .contentType(MediaType.IMAGE_PNG)
        .body(imageService.getImageByName(name))

    @PostMapping("/image/{name}")
    fun addImageByName(@PathVariable name: String, @RequestBody image: ByteArray) = imageService.addImageByName(name, image)
}