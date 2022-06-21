package com.dgcheca.microserviceContabilidad.model.entity

import javax.persistence.*

@Entity
@Table(name = "facturas")
data class FacturaEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "facturas_generator")
    var id: Int? = null,
    var usuarioid: Int = 0
)