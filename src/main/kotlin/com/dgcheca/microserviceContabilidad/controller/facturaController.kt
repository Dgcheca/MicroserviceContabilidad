package com.dgcheca.microserviceContabilidad.controller

import com.dgcheca.microserviceContabilidad.model.response.FacturaResponse
import com.dgcheca.microserviceContabilidad.service.FacturaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin("*")
class facturaController {

    @Autowired
    lateinit var facturaService: FacturaService

    @GetMapping("/usuario/{id}")
    fun verFacturas(@RequestParam id: Int): ResponseEntity<FacturaResponse>{
        return ResponseEntity(facturaService.verFacturas(id), HttpStatus.OK)
    }
}