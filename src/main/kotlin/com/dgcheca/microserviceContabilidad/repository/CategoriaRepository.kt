package com.dgcheca.microserviceContabilidad.repository

import com.dgcheca.microserviceContabilidad.model.entity.CategoriaEntity
import com.dgcheca.microserviceContabilidad.model.response.CategoriaResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository : JpaRepository<CategoriaEntity, Int> {
    fun findAllCategorias(): CategoriaResponse
}