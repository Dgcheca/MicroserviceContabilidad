package com.dgcheca.microserviceContabilidad.model.entity

import javax.persistence.*

@Entity
@Table(name = "facturas")
data class FacturaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "facturas_generator")
    var id: Int? = null,
    var usuarioid: Int = 0,
    var categoriaId: Int = 0,
    var fecha: String = "",
    var sacado: Boolean = false,
    var pagado: Boolean = false,
    var activo: Boolean = true,
    var fechaSacado: String = "",
    var fechaPagado: String = ""

)