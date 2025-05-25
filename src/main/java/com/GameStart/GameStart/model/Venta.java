package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Venta {

    private int id_venta;
    private int precio_total;
    private int cantidad_ventas_juego;
    private int pago_id_pago;
    private int vendedor_id_vendedor;
    private int cliente_id_cliente;

}
