package com.dgcheca.microserviceContabilidad.controller

import com.dgcheca.microserviceContabilidad.model.response.CategoriaResponse
import com.dgcheca.microserviceContabilidad.service.CategoriaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
class CategoriaController {

    @Autowired
    lateinit var categoriaService: CategoriaService

    @GetMapping("/")
    fun verCategorias(@RequestParam id: Int): ResponseEntity<CategoriaResponse> {
        return ResponseEntity(categoriaService.verCategorias(), HttpStatus.OK)
    }
}