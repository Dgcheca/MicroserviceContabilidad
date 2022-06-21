package com.dgcheca.microserviceContabilidad.model.response

import com.dgcheca.microserviceContabilidad.model.FacturaDto

data class FacturaResponse (
    val facturas: List<FacturaDto>

)