package com.GameStart.GameStart.model;

import lombok.Generated;

public class Venta {

    private int id_venta;
    private int precio_total;
    private int cantidad_ventas_juego;
    private int pago_id_pago;
    private int vendedor_id_vendedor;
    private int cliente_id_cliente;

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
    public int getPago_id_pago() {
        return pago_id_pago;
    }

    @Generated
    public int getVendedor_id_vendedor() {
        return vendedor_id_vendedor;
    }

    @Generated
    public int getCliente_id_cliente() {
        return cliente_id_cliente;
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

    @Generated
    public void setPago_id_pago(final int pago_id_pago) {
        this.pago_id_pago = pago_id_pago;
    }

    @Generated
    public void setVendedor_id_vendedor(final int vendedor_id_vendedor) {
        this.vendedor_id_vendedor = vendedor_id_vendedor;
    }

    @Generated
    public void setCliente_id_cliente(final int cliente_id_cliente) {
        this.cliente_id_cliente = cliente_id_cliente;
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Venta)) {
         return false;
      } else {
         Venta other = (Venta)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_venta() != other.getId_venta()) {
            return false;
         } else if (this.getCliente_id_cliente() != other.getCliente_id_cliente()) {
            return false;
         } else if (this.getVendedor_id_vendedor() != other.getVendedor_id_vendedor()) {
            return false;
         } else if (Float.compare(this.getPrecio_total(), other.getPrecio_total()) != 0) {
            return false;
         } else {
            Object this$cantidad_ventas_juego = this.getCantidad_ventas_juego();
            Object other$cantidad_ventas_juego = other.getCantidad_ventas_juego();
            if (this$cantidad_ventas_juego == null) {
               if (other$cantidad_ventas_juego != null) {
                  return false;
               }
            } else if (!this$cantidad_ventas_juego.equals(other$cantidad_ventas_juego)) {
               return false;
            }

            return true;
         }
      }
   }

    @Generated
    protected boolean canEqual(final Object other) {
       return other instanceof Venta;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getId_venta();
        result = result * 59 + this.getCliente_id_cliente();
        result = result * 59 + this.getVendedor_id_vendedor();
        result = result * 59 + this.getPrecio_total();
        Object $cantidad_ventas_juego = this.getCantidad_ventas_juego();
        result = result * 59 + ($cantidad_ventas_juego == null ? 43 : $cantidad_ventas_juego.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        int var1 = this.getId_venta();
        return "Venta(id_venta=" + var1 + ", precio_total=" + this.getPrecio_total() + ", cantidad_ventas_juego=" + this.getCantidad_ventas_juego() + ", pago_id_pago=" + this.getPago_id_pago() + ", vendedor_id_vendedor=" + this.getVendedor_id_vendedor() + ", cliente_id_cliente=" + this.getCliente_id_cliente() + ")";
    }

    @Generated
    public Venta(final int id_venta, final int precio_total, final int cantidad_ventas_juego, final int pago_id_pago, final int vendedor_id_vendedor, final int cliente_id_cliente) {
        this.id_venta = id_venta;
        this.precio_total = precio_total;
        this.cantidad_ventas_juego = cantidad_ventas_juego;
        this.pago_id_pago = pago_id_pago;
        this.vendedor_id_vendedor = vendedor_id_vendedor;
        this.cliente_id_cliente = cliente_id_cliente;
    }

    @Generated
    public Venta() {
    }




}
