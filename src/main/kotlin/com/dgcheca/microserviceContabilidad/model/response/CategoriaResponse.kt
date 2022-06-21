package com.dgcheca.microserviceContabilidad.model.response

import com.dgcheca.microserviceContabilidad.model.CategoriaDto

data class CategoriaResponse(
    val categorias: List<CategoriaDto>
)