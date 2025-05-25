package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private int id_usuario;
    private String correo_usuario;
    private String contraseña_usuario;
    private int id_rol;
    private int id_cliente;
    private int id_vendedor;

}
