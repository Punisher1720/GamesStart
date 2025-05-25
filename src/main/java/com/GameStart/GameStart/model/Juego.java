package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Juego {

    private int cod_juego;
    private String nombre_juego;
    private String genero_juego;
    private int stock_juego;
    private int precio_juego;
    private int Descuento_id_descuento;
    private int venta_id_venta;

}
