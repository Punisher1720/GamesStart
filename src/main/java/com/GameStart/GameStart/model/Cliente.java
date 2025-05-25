package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Cliente {

    private int id_cliente;
    private String nombre_cliente;
    private String correo_cliente;
    private String telefono;
}

