package com.GameStart.GameStart.model;

import lombok.Generated;

public class Descuento {

    private int id_descuento;
    private int descuento_juego;

    @Generated
    public int getId_descuento() {
        return id_descuento;
    }

    @Generated
    public int getDescuento_juego() {
        return descuento_juego;
    }

    @Generated
    public void setId_descuento(final int id_descuento) {
        this.id_descuento = id_descuento;
    }

    @Generated
    public void setDescuento_juego(final int descuento_juego) {
        this.descuento_juego = descuento_juego;
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Descuento)) {
         return false;
      } else {
         Descuento other = (Descuento)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_descuento() != other.getId_descuento()) {
            return false;
         } else if (Float.compare(this.getDescuento_juego(), other.getDescuento_juego()) != 0) {
            return false;
            } else {    
            return true;
         }
      }
   }

    @Generated
    protected boolean canEqual(final Object other) {
        return other instanceof Descuento;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId_descuento();
        result = result * PRIME + this.getDescuento_juego();
        return result;
    }

    @Generated
    public String toString() {
        int var1 = this.getId_descuento();
        return "Descuento(id_descuento=" + this.getId_descuento() + ", descuento_juego=" + this.getDescuento_juego() + ")";
    }

    @Generated
    public Descuento(final int id_descuento, final int descuento_juego) {
        this.id_descuento = id_descuento;
        this.descuento_juego = descuento_juego;
    }

    @Generated
    public Descuento() {
    }


}
