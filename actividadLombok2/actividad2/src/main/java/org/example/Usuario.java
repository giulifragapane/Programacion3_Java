package org.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Usuario {
    private final int id;
    private String nombre;
    private String email;
}
