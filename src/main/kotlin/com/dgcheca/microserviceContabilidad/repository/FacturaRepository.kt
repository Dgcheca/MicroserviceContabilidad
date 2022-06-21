package com.dgcheca.microserviceContabilidad.repository

import com.dgcheca.microserviceContabilidad.model.entity.FacturaEntity
import com.dgcheca.microserviceContabilidad.model.response.FacturaResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FacturaRepository : JpaRepository<FacturaEntity, Int> {
    fun findAllByUsuarioid(id: Int): FacturaResponse
}