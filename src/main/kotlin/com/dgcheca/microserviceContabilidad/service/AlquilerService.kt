package com.dgcheca.microserviceContabilidad.service

import com.dgcheca.microserviceContabilidad.model.response.AlquilerResponse
import com.dgcheca.microserviceContabilidad.repository.AlquilerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AlquilerService {

    @Autowired
    private lateinit var alquilerRepository: AlquilerRepository

    fun verAlquileres(id: Int): AlquilerResponse {
        return alquilerRepository.findAllByUsuarioid(id)
    }
}