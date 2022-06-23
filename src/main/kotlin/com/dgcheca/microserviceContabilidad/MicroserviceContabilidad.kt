package com.dgcheca.microserviceContabilidad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
@SpringBootApplication
open class MicroserviceContabilidad

fun main(args: Array<String>) {
    runApplication<MicroserviceContabilidad>(*args)
}