package com.GameStart.GameStart.model;

import lombok.Generated;

public class Juego {

    private int cod_juego;
    private String nombre_juego;
    private String genero_juego;
    private int stock_juego;
    private int precio_juego;
    private int Descuento_id_descuento;
    private int venta_id_venta;

    @Generated
    public int getCod_juego() {
        return cod_juego;
    }

    @Generated
    public String getNombre_juego() {
        return nombre_juego;
    }

    @Generated
    public String getGenero_juego() {
        return genero_juego;
    }

    @Generated
    public int getStock_juego() {
        return stock_juego;
    }

    @Generated
    public int getPrecio_juego() {
        return precio_juego;
    }

    @Generated
    public int getDescuento_id_descuento() {
        return Descuento_id_descuento;
    }

    @Generated
    public int getVenta_id_venta() {
        return venta_id_venta;
    }

    @Generated
    public void setCod_juego(final int cod_juego) {
        this.cod_juego = cod_juego;
    }

    @Generated
    public void setNombre_juego(final String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    @Generated  
    public void setGenero_juego(final String genero_juego) {
        this.genero_juego = genero_juego;
    }

    @Generated
    public void setStock_juego(final int stock_juego) {
        this.stock_juego = stock_juego;
    }

    @Generated
    public void setPrecio_juego(final int precio_juego) {
        this.precio_juego = precio_juego;
    }

    @Generated
    public void setDescuento_id_descuento(final int Descuento_id_descuento) {
        this.Descuento_id_descuento = Descuento_id_descuento;
    }

    @Generated
    public void setVenta_id_venta(final int venta_id_venta) {
        this.venta_id_venta = venta_id_venta;
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Juego)) {
         return false;
      } else {
         Juego other = (Juego)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCod_juego() != other.getCod_juego()) {
            return false;
         } else if (Float.compare(this.getPrecio_juego(), other.getPrecio_juego()) != 0) {
            return false;
         } else {
            label64: {
               Object this$nombre_juego = this.getNombre_juego();
               Object other$nombre_juego = other.getNombre_juego();
               if (this$nombre_juego == null) {
                  if (other$nombre_juego == null) {
                     break label64;
                  }
               } else if (this$nombre_juego.equals(other$nombre_juego)) {
                  break label64;
               }

               return false;
            }

                label57:{
               Object this$genero_juego = this.getGenero_juego();
               Object other$genero_juego = other.getGenero_juego();
               if (this$genero_juego == null) {
                  if (other$genero_juego == null) {
                     break label57;
                  }
               } else if (this$genero_juego.equals(other$genero_juego)) {
                  break label57;
               }

               return false;
            }

            Object this$sotck_juego = this.getStock_juego();
            Object other$sotck_juego = other.getStock_juego();
            if (this$sotck_juego == null) {
               if (other$sotck_juego != null) {
                  return false;
               }
            } else if (!this$sotck_juego.equals(other$sotck_juego)) {
               return false;
            }

            Object this$precio_juego = this.getPrecio_juego();
            Object other$precio_juego = other.getPrecio_juego();
            if (this$precio_juego == null) {
               if (other$precio_juego != null) {
                  return false;
               }
            } else if (!this$precio_juego.equals(other$precio_juego)) {
               return false;
            }

            Object this$Descuento_id_descuento = this.getDescuento_id_descuento();
            Object other$Descuento_id_descuento = other.getDescuento_id_descuento();
            if (this$Descuento_id_descuento == null) {
               if (other$Descuento_id_descuento != null) {
                  return false;
               }
            } else if (!this$Descuento_id_descuento.equals(other$Descuento_id_descuento)) {
               return false;
            }

            Object this$venta_id_venta = this.getVenta_id_venta();
            Object other$venta_id_venta = other.getVenta_id_venta();
            if (this$venta_id_venta == null) {
               if (other$venta_id_venta != null) {
                  return false;
               }
            } else if (!this$venta_id_venta.equals(other$venta_id_venta)) {
               return false;
            }

            return true;
         }
      }
   }

    @Generated
    protected boolean canEqual(final Object other) {
        return other instanceof Juego;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getCod_juego();
        result = result * 59 + Float.floatToIntBits(this.getPrecio_juego());
        final Object $nombre_juego = this.getNombre_juego();
        result = result * 59 + ($nombre_juego == null ? 43 : $nombre_juego.hashCode());
        final Object $genero_juego = this.getGenero_juego();
        result = result * 59 + ($genero_juego == null ? 43 : $genero_juego.hashCode());
        final Object $sotck_juego = this.getStock_juego();
        result = result * 59 + ($sotck_juego == null ? 43 : $sotck_juego.hashCode());
        final Object $precio_juego = this.getPrecio_juego();
        result = result * 59 + ($precio_juego == null ? 43 : $precio_juego.hashCode());
        final Object $Descuento_id_descuento = this.getDescuento_id_descuento();
        result = result * 59 + ($Descuento_id_descuento == null ? 43 : $Descuento_id_descuento.hashCode());
        final Object $venta_id_venta = this.getVenta_id_venta();
        result = result * 59 + ($venta_id_venta == null ? 43 : $venta_id_venta.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Juego(cod_juego=" + this.getCod_juego() + ", nombre_juego=" + this.getNombre_juego() + ", genero_juego=" + this.getGenero_juego() + ", stock_juego=" + this.getStock_juego() + ", precio_juego=" + this.getPrecio_juego() + ", Descuento_id_descuento=" + this.getDescuento_id_descuento() + ", venta_id_venta=" + this.getVenta_id_venta() + ")";
    }

    @Generated
    public Juego(final int cod_juego, final String nombre_juego, final String genero_juego, final int stock_juego, final int precio_juego, final int Descuento_id_descuento, final int venta_id_venta) {
        this.cod_juego = cod_juego;
        this.nombre_juego = nombre_juego;
        this.genero_juego = genero_juego;
        this.stock_juego = stock_juego;
        this.precio_juego = precio_juego;
        this.Descuento_id_descuento = Descuento_id_descuento;
        this.venta_id_venta = venta_id_venta;
    }

    @Generated
    public Juego() {
    }



}
