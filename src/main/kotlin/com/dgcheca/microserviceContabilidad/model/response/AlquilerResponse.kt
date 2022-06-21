package com.dgcheca.microserviceContabilidad.model.response

import com.dgcheca.microserviceContabilidad.model.AlquilerDto

data class AlquilerResponse(
    val facturas: List<AlquilerDto>

)