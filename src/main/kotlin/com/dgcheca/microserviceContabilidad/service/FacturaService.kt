package com.dgcheca.microserviceContabilidad.service

import com.dgcheca.microserviceContabilidad.model.FacturaDto
import com.dgcheca.microserviceContabilidad.model.entity.FacturaEntity
import com.dgcheca.microserviceContabilidad.model.response.FacturaResponse
import com.dgcheca.microserviceContabilidad.repository.FacturaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FacturaService {

    @Autowired
    private lateinit var facturaRepository: FacturaRepository

    fun verFacturas(id: Int): FacturaResponse {
        return facturaRepository.findAllByUsuarioid(id)
    }

    fun nuevoFactura(factura: FacturaDto): FacturaDto {
        val facturaDb = facturaRepository.save(
            FacturaEntity(
                id = factura.id,
                usuarioid = factura.usuarioid,
                categoriaId = factura.categoriaId,
                fecha = factura.fecha,
                sacado = factura.sacado,
                pagado = factura.pagado,
                activo = factura.activo,
                fechaSacado = factura.fechaSacado,
                fechaPagado = factura.fechaPagado
            )
        )
        return FacturaDto(
            id = facturaDb.id,
            usuarioid = facturaDb.usuarioid,
            categoriaId = facturaDb.categoriaId,
            fecha = facturaDb.fecha,
            sacado = facturaDb.sacado,
            pagado = facturaDb.pagado,
            activo = facturaDb.activo,
            fechaSacado = facturaDb.fechaSacado,
            fechaPagado = facturaDb.fechaPagado

        )
    }

    fun sacarFactura(id: Int): FacturaDto {
        val facturaDb = facturaRepository.findByIdAndSacado(id, false)
        val facturaSacado = facturaRepository.save(
            FacturaEntity(
                id = facturaDb.id,
                usuarioid = facturaDb.usuarioid,
                categoriaId = facturaDb.categoriaId,
                fecha = facturaDb.fecha,
                sacado = true,
                pagado = facturaDb.pagado,
                activo = facturaDb.activo,
                fechaSacado = facturaDb.fechaSacado,
                fechaPagado = facturaDb.fechaPagado
            )
        )
        return FacturaDto(
            id = facturaSacado.id,
            usuarioid = facturaSacado.usuarioid,
            categoriaId = facturaSacado.categoriaId,
            fecha = facturaSacado.fecha,
            sacado = facturaSacado.sacado,
            pagado = facturaSacado.pagado,
            activo = facturaSacado.activo,
            fechaSacado = facturaSacado.fechaSacado,
            fechaPagado = facturaSacado.fechaPagado
        )
    }

    fun pagarFactura(id: Int): FacturaDto {
        val facturaDb = facturaRepository.findByIdAndPagado(id, false)
        val facturaSacado = facturaRepository.save(
            FacturaEntity(
                id = facturaDb.id,
                usuarioid = facturaDb.usuarioid,
                categoriaId = facturaDb.categoriaId,
                fecha = facturaDb.fecha,
                sacado = facturaDb.sacado,
                pagado = true,
                activo = facturaDb.activo,
                fechaSacado = facturaDb.fechaSacado,
                fechaPagado = facturaDb.fechaPagado
            )
        )
        return FacturaDto(
            id = facturaSacado.id,
            usuarioid = facturaSacado.usuarioid,
            categoriaId = facturaSacado.categoriaId,
            fecha = facturaSacado.fecha,
            sacado = facturaSacado.sacado,
            pagado = facturaSacado.pagado,
            activo = facturaSacado.activo,
            fechaSacado = facturaSacado.fechaSacado,
            fechaPagado = facturaSacado.fechaPagado
        )
    }
}