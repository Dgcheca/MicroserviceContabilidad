package com.dgcheca.microserviceContabilidad.repository

import com.dgcheca.microserviceContabilidad.model.entity.AlquilerEntity
import com.dgcheca.microserviceContabilidad.model.response.AlquilerResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlquilerRepository : JpaRepository<AlquilerEntity, Int> {
    fun findAllByUsuarioid(id: Int): AlquilerResponse
    fun findByIdAndSacado(id: Int, sacado: Boolean): AlquilerEntity
    fun findByIdAndPagado(id: Int, pagado: Boolean): AlquilerEntity
}