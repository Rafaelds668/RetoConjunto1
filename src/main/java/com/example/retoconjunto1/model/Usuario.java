package com.example.retoconjunto1.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int id_usuario;
    private String nombre_usuario;
    private String contraseña_usuario;
    private String email_usuario;
}
