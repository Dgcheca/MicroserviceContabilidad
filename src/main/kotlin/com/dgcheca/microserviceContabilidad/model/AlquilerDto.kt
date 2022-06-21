package com.dgcheca.microserviceContabilidad.model

class AlquilerDto(
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

