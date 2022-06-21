package com.dgcheca.microserviceContabilidad.service

import com.dgcheca.microserviceContabilidad.model.response.FacturaResponse
import com.dgcheca.microserviceContabilidad.repository.FacturaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FacturaService {

    @Autowired
    private lateinit var facturaRepository: FacturaRepository

    fun verFacturas(id: Int): FacturaResponse {
        return facturaRepository.findAllByUsuarioid(id)
    }
}