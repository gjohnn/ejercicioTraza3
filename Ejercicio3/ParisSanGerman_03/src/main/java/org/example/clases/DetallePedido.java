package org.example.clases;

import lombok.*;
import java.util.HashSet;

@Data
@Builder

public class DetallePedido {

    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
    @Builder.Default
    private HashSet<Pedido> detalles = new HashSet<>();
}
