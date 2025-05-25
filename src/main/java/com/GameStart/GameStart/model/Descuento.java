package com.GameStart.GameStart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Generated;

@Entity
@Table(name = "descuento")


public class Descuento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer cod_descuento;
    @Column(
        unique = true,
        length =30,
        nullable = false
    )   
    private String nombre_descuento;
    @Column(
        length = 50,
        nullable = false
    )
    @ManyToOne
    private Juego juego;
    
    @Generated
    public Integer getCod_descuento() {
    return this.cod_descuento;
}
    @Generated
    public String getNombre_descuento() {
        return this.nombre_descuento;
    }

    @Generated
    public Juego getJuego() {
        return this.juego;
    }

    @Generated
    public void setCod_descuento(final Integer cod_descuento) {
        this.cod_descuento = cod_descuento;
    }

    @Generated
    public void setNombre_descuento(final String nombre_descuento) {
        this.nombre_descuento = nombre_descuento;
    }

    @Generated
   public boolean canEqual(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Descuento)) {
         return false;
      } else {
         Descuento other = (Descuento)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$cod_descuento = this.getCod_descuento();
            Object other$cod_descuento = other.getCod_descuento();
            if (this$cod_descuento == null) {
               if (other$cod_descuento != null) {
                  return false;
               }
            } else if (!this$cod_descuento.equals(other$cod_descuento)) {
               return false;
            }

            Object this$nombre_descuento = this.getNombre_descuento();
            Object other$nombre_descuento = other.getNombre_descuento();
            if (this$nombre_descuento == null) {
               if (other$nombre_descuento != null) {
                  return false;
               }
            } else if (!this$nombre_descuento.equals(other$nombre_descuento)) {
               return false;
            }
            return true;
         }
      }
   }

    @Generated
    public int hashCode() {
        int result = 1;
        Object $cod_descuento = this.getCod_descuento();
        result = result * 59 + ($cod_descuento == null ? 43 : $cod_descuento.hashCode());
        Object $nombre_descuento = this.getNombre_descuento();
        result = result * 59 + ($nombre_descuento == null ? 43 : $nombre_descuento.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "Descuento(cod_descuento=" + this.getCod_descuento() + ", nombre_descuento=" + this.getNombre_descuento() + ")";
    }

    @Generated
    public Descuento() {
    }

    @Generated
    public Descuento(final Integer cod_descuento, final String nombre_descuento) {
        this.cod_descuento = cod_descuento;
        this.nombre_descuento = nombre_descuento;
    }


}
