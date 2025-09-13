package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;
}
