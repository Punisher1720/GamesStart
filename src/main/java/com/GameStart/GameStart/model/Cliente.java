package com.GameStart.GameStart.model;

import lombok.Generated;

public class Cliente {

    private int id_cliente;
    private String nombre_cliente;
    private String correo_cliente;
    private String telefono;

    @Generated
    public int getId_cliente() {
        return id_cliente;
    }

    @Generated
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    @Generated
    public String getCorreo_cliente() {
        return correo_cliente;
    }

    @Generated
    public String getTelefono() {
        return telefono;
    }

    @Generated 
    public void setId_cliente(final int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Generated
    public void setNombre_cliente(final String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    @Generated
    public void setCorreo_cliente(final String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    @Generated
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Cliente)) {
         return false;
      } else {
         Cliente other = (Cliente)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_cliente() != other.getId_cliente()) {
            return false;
         } else if (this.getId_cliente() != other.getId_cliente()) {
            return false;
         } else {
           label76:{
               Object this$correo_cliente = this.getCorreo_cliente();
               Object other$correo_cliente = other.getCorreo_cliente();
               if (this$correo_cliente == null) {
                  if (other$correo_cliente == null) {
                     break label76;
                  }
               } else if (this$correo_cliente.equals(other$correo_cliente)) {
                  break label76;
               }

               return false;
            }

            Object this$rut = this.getCorreo_cliente();
            Object other$rut = other.getCorreo_cliente();
            if (this$rut == null) {
               if (other$rut != null) {
                  return false;
               }
            } else if (!this$rut.equals(other$rut)) {
               return false;
            }

            label62:{
               Object this$telefono = this.getTelefono();
               Object other$telefono = other.getTelefono();
               if (this$telefono == null) {
                  if (other$telefono == null) {
                     break label62;
                  }
               } else if (this$telefono.equals(other$telefono)) {
                  break label62;
               }

               return false;
            }
         }
      }
   }

    



}

