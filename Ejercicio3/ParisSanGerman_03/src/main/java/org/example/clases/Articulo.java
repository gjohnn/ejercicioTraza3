package org.example.clases;

import lombok.*;

@Data
@Builder

public class Articulo {

    private Long id;
    private String denominacion;
    private Double precioVenta, precioCompra;
    private Integer stockActual, stockMaximo, tiempoEstimadoMinutos;
    private UnidadMedida unidadMedida;
    private Imagenes imagen;

}
