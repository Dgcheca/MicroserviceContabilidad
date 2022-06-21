package com.dgcheca.microserviceContabilidad.controller

import com.dgcheca.microserviceContabilidad.model.response.AlquilerResponse
import com.dgcheca.microserviceContabilidad.service.AlquilerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/alquiler")
@CrossOrigin("*")
class AlquilerController {

    @Autowired
    lateinit var alquilerService: AlquilerService

    @GetMapping("/usuario/{id}")
    fun verAlquileres(@RequestParam id: Int): ResponseEntity<AlquilerResponse> {
        return ResponseEntity(alquilerService.verAlquileres(id), HttpStatus.OK)
    }
}