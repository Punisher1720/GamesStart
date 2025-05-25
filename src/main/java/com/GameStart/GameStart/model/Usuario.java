package com.GameStart.GameStart.model;

import lombok.Generated;

public class Usuario {
    private int id_usuario;
    private String correo_usuario;
    private String contraseña_usuario;

    @Generated
    public int getId_usuario() {
        return id_usuario;
    }

    @Generated
    public String getCorreo_usuario() {
        return correo_usuario;
    }

    @Generated
    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setId_usuario(final int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setCorreo_usuario(final String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public void setContraseña_usuario(final String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Usuario)) {
         return false;
      } else {
         Usuario other = (Usuario)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_usuario() != other.getId_usuario()) {
            return false;
         } else if (this.getId_usuario() != other.getId_usuario()) {
            return false;
         } else {
            {
               Object this$correo_usuario = this.getCorreo_usuario();
               Object other$correo_usuario = other.getCorreo_usuario();
               if (this$correo_usuario == null) {
                  if (other$correo_usuario == null) {
                     break;
                  }
               } else if (this$correo_usuario.equals(other$correo_usuario)) {
                  break;
               }

               return false;
            }

            Object this$contraseña_usuario = this.getContraseña_usuario();
            Object other$contraseña_usuario = other.getContraseña_usuario();
            if (this$contraseña_usuario == null) {
               if (other$contraseña_usuario != null) {
                  return false;
               }
            } else if (!this$contraseña_usuario.equals(other$contraseña_usuario)) {
               return false;
            }
         }
      }
   }


}
