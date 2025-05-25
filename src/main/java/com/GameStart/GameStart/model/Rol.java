package com.GameStart.GameStart.model;

import lombok.Generated;

public class Rol {

    private int id_rol;;
    private String nombre_rol;

    @Generated
    public int getId_rol() {
    return id_rol;
    
    }   

@  Generated
    public String getNombre_rol() {
    return nombre_rol;
    
    }

    @Generated
    public void setId_rol(final int id_rol) {
        this.id_rol = id_rol;
    }

    @Generated
    public void setNombre_rol(final String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Rol)) {
         return false;
      } else {
         Rol other = (Rol)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_rol() != other.getId_rol()) {
            return false;
         } else {
            Object this$nombre = this.getNombre_rol();
            Object other$nombre = other.getNombre_rol();
            if (this$nombre == null) {
               if (other$nombre != null) {
                  return false;
               }
            } else if (!this$nombre.equals(other$nombre)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Rol;
   }





}    


