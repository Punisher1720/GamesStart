package com.GameStart.GameStart.model;

import lombok.Generated;

public class Venta {

    private int id_venta;
    private int precio_total;
    private int cantidad_ventas_juego;

    @Generated
    public int getId_venta() {
        return id_venta;
    }

    @Generated
    public int getPrecio_total() {
        return precio_total;
    }

    @Generated
    public int getCantidad_ventas_juego() {
        return cantidad_ventas_juego;
    }

    @Generated
    public void setId_venta(final int id_venta) {
        this.id_venta = id_venta;
    }

    @Generated
    public void setPrecio_total(final int precio_total) {
        this.precio_total = precio_total;
    }

    @Generated
    public void setCantidad_ventas_juego(final int cantidad_ventas_juego) {
        this.cantidad_ventas_juego = cantidad_ventas_juego;
    }

    

}
