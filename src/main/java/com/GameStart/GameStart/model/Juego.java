package com.GameStart.GameStart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;



@Entity
@Table (name = "juego")

public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer cod_juego;
    @Column(
        unique = true,
        length = 30,
        nullable = false
    )

    String nombre_juego;
    @Column(
    nullable = false
    )

    String genero_juego;
    @Column(
        nullable = false
    )

    Integer stock_juego;
    @Column(
        nullable = false
    )

    Integer precio_juego;
    @Column(
        nullable = false
    )

    Integer venta_id_venta;
    @Column(
        nullable = false
    )

    @Generated
    public Integer getCod_juego() {
        return this.cod_juego;
    }

    @Generated
    public String getNombre_juego() {
        return this.nombre_juego;
    }

    @Generated
    public String getGenero_juego() {
        return this.genero_juego;
    }

    @Generated
    public Integer getStock_juego() {
        return this.stock_juego;
    }

    @Generated
    public Integer getPrecio_juego() {
        return this.precio_juego;
    }

    @Generated
    public Integer getVenta_id_venta() {
        return this.venta_id_venta;
    }

    @Generated
    public void setCod_juego(final Integer cod_juego) {
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
    public void setStock_juego(final Integer stock_juego) {
        this.stock_juego = stock_juego;
    }

    @Generated
    public void setPrecio_juego(final Integer precio_juego) {
        this.precio_juego = precio_juego;
    }

    @Generated
    public void setVenta_id_venta(final Integer venta_id_venta) {
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
         if (!other.Equal(this)) {
            return false;
         } else {
            Object this$cod_juego = this.getCod_juego();
            Object other$cod_juego = other.getCod_juego();
            if (this$cod_juego == null) {
               if (other$cod_juego != null) {
                  return false;
               }
            } else if (!this$cod_juego.equals(other$cod_juego)) {
               return false;
            }

            Object this$nombre_juego = this.getNombre_juego();
            Object other$nombre_juego = other.getNombre_juego();
            if (this$nombre_juego == null) {
               if (other$nombre_juego != null) {
                  return false;
               }
            } else if (!this$nombre_juego.equals(other$nombre_juego)) {
               return false;
            }

            Object this$genero_juego = this.getGenero_juego();
            Object other$genero_juego = other.getGenero_juego();
            if (this$genero_juego == null) {
               if (other$genero_juego != null) {
                  return false;
               }
            } else if (!this$genero_juego.equals(other$genero_juego)) {
               return false;
            }

            label62: {
               Object this$stock_juego = this.getStock_juego();
               Object other$stock_juego = other.getStock_juego();
               if (this$stock_juego == null) {
                  if (other$stock_juego == null) {
                     break label62;
                  }
               } else if (this$stock_juego.equals(other$stock_juego)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$precio_juego = this.getPrecio_juego();
               Object other$precio_juego = other.getPrecio_juego();
               if (this$precio_juego == null) {
                  if (other$precio_juego == null) {
                     break label55;
                  }
               } else if (this$precio_juego.equals(other$precio_juego)) {
                  break label55;
               }

               return false;
            }

            Object this$venta_id_venta= this.getVenta_id_venta();
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
   protected boolean Equal(final Object o) {
      return this.equals(o);
   }

   @Generated
   public int hashCode() {
      int result = 1;
      Object $cod_juego = this.getCod_juego();
      result = result * 59 + ($cod_juego == null ? 43 : $cod_juego.hashCode());
      Object $nombre_juego = this.getNombre_juego();
      result = result * 59 + ($nombre_juego == null ? 43 : $nombre_juego.hashCode());
      Object $genero_juego = this.getGenero_juego();
      result = result * 59 + ($genero_juego == null ? 43 : $genero_juego.hashCode());
      Object $stock_juego = this.getStock_juego();
      result = result * 59 + ($stock_juego == null ? 43 : $stock_juego.hashCode());
      Object $precio_juego = this.getPrecio_juego();
      result = result * 59 + ($precio_juego == null ? 43 : $precio_juego.hashCode());
      Object $venta_id_venta = this.getVenta_id_venta();
      result = result * 59 + ($venta_id_venta == null ? 43 : $venta_id_venta.hashCode());
      return result;
   }

   @Generated
    public String toString() {
        String var1 = String.valueOf(this.getCod_juego());
        return "Juego(cod_juego=" + this.getCod_juego() + ", nombre_juego=" + this.getNombre_juego() + ", genero_juego=" + this.getGenero_juego() + ", stock_juego=" + this.getStock_juego() + ", precio_juego=" + this.getPrecio_juego() + ", venta_id_venta=" + this.getVenta_id_venta() + ")";
    }

    @Generated
    public Juego() {
    }

    @Generated
    public Juego(final Integer cod_juego, final String nombre_juego, final String genero_juego, final Integer stock_juego, final Integer precio_juego, final Integer venta_id_venta) {
        this.cod_juego = cod_juego;
        this.nombre_juego = nombre_juego;
        this.genero_juego = genero_juego;
        this.stock_juego = stock_juego;
        this.precio_juego = precio_juego;
        this.venta_id_venta = venta_id_venta;
    }


}
