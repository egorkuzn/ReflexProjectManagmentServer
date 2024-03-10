package ru.nsu.fit.reflex.project_management.core.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.nsu.fit.reflex.project_management.core.service.ImageService

@RestController
class Controller(private val imageService: ImageService) {
    @GetMapping("/image/{name}")
    fun getImageByName(@PathVariable name: String) = imageService.getImageByName(name)

    @PostMapping("/image/{name}")
    fun addImageByName(
        @PathVariable name: String,
        @RequestBody image: ByteArray
    ) = imageService.addImageByName(name, image)
}