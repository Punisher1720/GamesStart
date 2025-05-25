package com.GameStart.GameStart.model;

import lombok.Generated;
import lombok.experimental.var;

public class Usuario {
    private int id_usuario;
    private String correo_usuario;
    private String contraseña_usuario;
    private int id_rol;
    private int id_cliente;
    private int id_vendedor;

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

    @Generated
    public int getId_rol() {
        return id_rol;
    }

    @Generated
    public int getId_cliente() {
        return id_cliente;
    }

    @Generated
    public int getId_vendedor() {
        return id_vendedor;
    }

    @Generated
    public void setId_usuario(final int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Generated
    public void setCorreo_usuario(final String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    @Generated
    public void setContraseña_usuario(final String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }
    
    @Generated
    public void setId_rol(final int id_rol) {
        this.id_rol = id_rol;
    }

    @Generated
    public void setId_cliente(final int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Generated
    public void setId_vendedor(final int id_vendedor) {
        this.id_vendedor = id_vendedor;
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
         } else if (this.getId_rol() != other.getId_rol()) {
            return false;
         } else {
            label54:{
               Object this$correo_usuario = this.getCorreo_usuario();
               Object other$correo_usuario = other.getCorreo_usuario();
               if (this$correo_usuario == null) {
                  if (other$correo_usuario == null) {
                     break label54;
                  }
               } else if (this$correo_usuario.equals(other$correo_usuario)) {
                  break label54;
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

            Object this$correo_usuario = this.getCorreo_usuario();
            Object other$correo_usuario = other.getCorreo_usuario();
            if (this$correo_usuario == null) {
               if (other$correo_usuario != null) {
                  return false;
               }
            } else if (!this$correo_usuario.equals(other$correo_usuario)) {
               return false;
            }

            return true;
            }
        }
   }

   @Generated
   public int hashCode() {
      int result = 1;
      result = result * 59 + this.getId_usuario();
      result = result * 59 + this.getId_rol();
      Object $correo_usuario = this.getCorreo_usuario();
      result = result * 59 + ($correo_usuario == null ? 43 : $correo_usuario.hashCode());
      Object $contraseña_usuario = this.getContraseña_usuario();
      result = result * 59 + ($contraseña_usuario == null ? 43 : $contraseña_usuario.hashCode());
      return result;
   }

   @Generated
   public String toString() {
        int var1 = this.getId_usuario();
      return "Usuario(id_usuario=" + var1 + this.getId_usuario() + ", correo_usuario=" + this.getCorreo_usuario() + ", contraseña_usuario=" + this.getContraseña_usuario() + ", id_rol=" + this.getId_rol() + ")";
    }

    @Generated
   public Usuario(final int id, final String correo_usuario, final String contraseña_usuario, final int id_rol) {
      this.id_usuario = id;
      this.correo_usuario = correo_usuario;
      this.contraseña_usuario = contraseña_usuario;
      this.id_rol = id_rol;
   }

   @Generated
   public Usuario() {
   }
   
}
