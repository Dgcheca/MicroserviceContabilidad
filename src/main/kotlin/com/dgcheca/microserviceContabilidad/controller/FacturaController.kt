package com.dgcheca.microserviceContabilidad.controller

import com.dgcheca.microserviceContabilidad.model.response.FacturaResponse
import com.dgcheca.microserviceContabilidad.service.FacturaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin("*")
class FacturaController {

    @Autowired
    lateinit var facturaService: FacturaService

    @GetMapping("/usuario/{id}")
    fun verFacturas(@RequestParam id: Int): ResponseEntity<FacturaResponse> {
        return ResponseEntity(facturaService.verFacturas(id), HttpStatus.OK)
    }
}