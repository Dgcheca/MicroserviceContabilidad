package com.dgcheca.microserviceContabilidad.model.entity

import javax.persistence.*

@Entity
@Table(name = "categorias")
data class CategoriaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "categorias_generator")
    var id: Int? = null,
    var nombre: String = "",
)