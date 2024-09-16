package org.example.clases;

import lombok.*;
import org.example.enums.Estado;
import org.example.enums.FormaPago;
import org.example.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;

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




}

