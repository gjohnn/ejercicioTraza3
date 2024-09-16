package org.example.clases;

import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;

@Data
@Builder

public class Cliente {

    private Long id;
    private String nombre, apellido, telefono, email;
    private LocalDate fechaNacimiento;

}
