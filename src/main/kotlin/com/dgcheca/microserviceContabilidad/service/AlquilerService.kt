package com.dgcheca.microserviceContabilidad.service

import com.dgcheca.microserviceContabilidad.model.AlquilerDto
import com.dgcheca.microserviceContabilidad.model.entity.AlquilerEntity
import com.dgcheca.microserviceContabilidad.model.response.AlquilerResponse
import com.dgcheca.microserviceContabilidad.repository.AlquilerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AlquilerService {

    @Autowired
    private lateinit var alquilerRepository: AlquilerRepository

    fun verAlquileres(id: Int): AlquilerResponse {
        return alquilerRepository.findAllByUsuarioid(id)
    }

    fun nuevoAlquiler(alquiler: AlquilerDto): AlquilerDto {
        val alquilerDb = alquilerRepository.save(
            AlquilerEntity(
                alquiler.id,
                alquiler.usuarioid,
                alquiler.mesNumero,
                alquiler.mesNombre,
                alquiler.fecha,
                alquiler.sacado,
                alquiler.pagado,
                alquiler.activo,
                alquiler.fechaSacado,
                alquiler.fechaPagado
            )
        )
        return AlquilerDto(
            id = alquilerDb.id,
            usuarioid = alquilerDb.usuarioid,
            mesNumero = alquilerDb.mesNumero,
            mesNombre = alquilerDb.mesNombre,
            fecha = alquilerDb.fecha,
            sacado = alquilerDb.sacado,
            pagado = alquilerDb.pagado,
            activo = alquilerDb.activo,
            fechaSacado = alquilerDb.fechaSacado,
            fechaPagado = alquilerDb.fechaPagado

        )
    }

    fun sacarAlquiler(id: Int): AlquilerDto {
        val alquilerDb = alquilerRepository.findByIdAndSacado(id, false)
        val alquilerSacado = alquilerRepository.save(
            AlquilerEntity(
                id = alquilerDb.id,
                usuarioid = alquilerDb.usuarioid,
                mesNumero = alquilerDb.mesNumero,
                mesNombre = alquilerDb.mesNombre,
                fecha = alquilerDb.fecha,
                sacado = true,
                pagado = alquilerDb.pagado,
                activo = alquilerDb.activo,
                fechaSacado = alquilerDb.fechaSacado,
                fechaPagado = alquilerDb.fechaPagado
            )
        )
        return AlquilerDto(
            id = alquilerSacado.id,
            usuarioid = alquilerSacado.usuarioid,
            mesNumero = alquilerSacado.mesNumero,
            mesNombre = alquilerSacado.mesNombre,
            fecha = alquilerSacado.fecha,
            sacado = alquilerSacado.sacado,
            pagado = alquilerSacado.pagado,
            activo = alquilerSacado.activo,
            fechaSacado = alquilerSacado.fechaSacado,
            fechaPagado = alquilerSacado.fechaPagado
        )
    }

    fun pagarAlquiler(id: Int): AlquilerDto {
        val alquilerDb = alquilerRepository.findByIdAndSacado(id, false)
        val alquilerSacado = alquilerRepository.save(
            AlquilerEntity(
                id = alquilerDb.id,
                usuarioid = alquilerDb.usuarioid,
                mesNumero = alquilerDb.mesNumero,
                mesNombre = alquilerDb.mesNombre,
                fecha = alquilerDb.fecha,
                sacado = alquilerDb.sacado,
                pagado = true,
                activo = alquilerDb.activo,
                fechaSacado = alquilerDb.fechaSacado,
                fechaPagado = alquilerDb.fechaPagado
            )
        )
        return AlquilerDto(
            id = alquilerSacado.id,
            usuarioid = alquilerSacado.usuarioid,
            mesNumero = alquilerSacado.mesNumero,
            mesNombre = alquilerSacado.mesNombre,
            fecha = alquilerSacado.fecha,
            sacado = alquilerSacado.sacado,
            pagado = alquilerSacado.pagado,
            activo = alquilerSacado.activo,
            fechaSacado = alquilerSacado.fechaSacado,
            fechaPagado = alquilerSacado.fechaPagado
        )
    }
}