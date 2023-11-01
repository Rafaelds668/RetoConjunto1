package com.example.retoconjunto1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private int id_producto;
    private String nombre_producto;
    private double precio_producto;
    private int cantidad_disponible_producto;
}
