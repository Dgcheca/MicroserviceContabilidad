package com.dgcheca.microserviceContabilidad.model.entity

import javax.persistence.*

@Entity
@Table(name = "alquileres")
data class AlquilerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "alquileres_generator")
    var id: Int? = null,
    var usuarioid: Int = 0,
    var mesNumero: Int = 0,
    var mesNombre: String = "",
    var fecha: String = "",
    var sacado: Boolean = false,
    var pagado: Boolean = false,
    var activo: Boolean = true,
    var fechaSacado: String = "",
    var fechaPagado: String = ""

)