package com.dgcheca.microserviceContabilidad.model

class FacturaDto(
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

