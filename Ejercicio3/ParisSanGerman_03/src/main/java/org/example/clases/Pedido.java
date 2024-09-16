package org.example.clases;

import lombok.*;
import org.example.enums.Estado;
import org.example.enums.FormaPago;
import org.example.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder

public class Pedido {

    private Long id;
    private LocalTime horaEstimadaFinalizacion;
    private LocalDate FechaPedido;
    private Double total, totalCosto;
    private TipoEnvio tipoEnvio;
    private Estado estado;
    private FormaPago formaPago;

    // Añadir el campo detalles
    @Builder.Default
    private Set<DetallePedido> detalles = new HashSet<>();
    private Cliente cliente;


}

