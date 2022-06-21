package com.dgcheca.microserviceContabilidad.service

import com.dgcheca.microserviceContabilidad.model.response.CategoriaResponse
import com.dgcheca.microserviceContabilidad.repository.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoriaService {

    @Autowired
    private lateinit var categoriaRepository: CategoriaRepository

    fun verCategorias(): CategoriaResponse {
        return categoriaRepository.findAllCategorias()
    }
}