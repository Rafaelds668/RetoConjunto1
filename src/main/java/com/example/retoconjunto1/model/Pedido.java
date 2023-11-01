package com.example.retoconjunto1.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private int id_pedido;
    private String codigo_pedido;
    private String fecha_pedido;
    private int usuario = getUsuario();
    private int total;
}
