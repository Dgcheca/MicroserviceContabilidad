package com.dgcheca.microserviceContabilidad.controller

import com.dgcheca.microserviceContabilidad.model.AlquilerDto
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
    fun verAlquileres(@PathVariable id: Int): ResponseEntity<AlquilerResponse> {
        return ResponseEntity(alquilerService.verAlquileres(id), HttpStatus.OK)
    }

    @PostMapping("/nuevoAlquiler")
    fun nuevoAlquiler(@RequestParam alquiler: AlquilerDto): ResponseEntity<AlquilerDto> {
        return ResponseEntity(alquilerService.nuevoAlquiler(alquiler), HttpStatus.OK)
    }

    @PutMapping("/sacarAlquiler/{id}")
    fun sacarAlquiler(@PathVariable id: Int): ResponseEntity<AlquilerDto> {
        return ResponseEntity(alquilerService.sacarAlquiler(id), HttpStatus.OK)
    }

    @PutMapping("/pagarAlquiler/{id}")
    fun pagarAlquiler(@PathVariable id: Int): ResponseEntity<AlquilerDto> {
        return ResponseEntity(alquilerService.pagarAlquiler(id), HttpStatus.OK)
    }
}