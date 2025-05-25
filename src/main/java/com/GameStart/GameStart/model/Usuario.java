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
               Object this$id_rol = this.getId_rol();
               Object other$id_rol = other.getId_rol();
               if (this$id_rol == null) {
                  if (other$id_rol == null) {
                     break label54;
                  }
               } else if (this$id_rol.equals(other$id_rol)) {
                  break label54;
               }

               return false;
            }

            Object this$id_cliente = this.getId_cliente();
            Object other$id_cliente = other.getId_cliente();
            if (this$id_cliente == null) {
               if (other$id_cliente != null) {
                  return false;
               }
            } else if (!this$id_cliente.equals(other$id_cliente)) {
               return false;
            }

            Object this$id_vendedor = this.getId_vendedor();
            Object other$id_vendedor = other.getId_vendedor();
            if (this$id_vendedor == null) {
               if (other$id_vendedor != null) {
                  return false;
               }
            } else if (!this$id_vendedor.equals(other$id_vendedor)) {
               return false;
            }

            return true;
            }
        }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Usuario;
   }

    @Generated
    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getId_usuario();
        result = result * 59 + this.getId_rol();
        Object $id_cliente = this.getId_cliente();
        result = result * 59 + ($id_cliente == null ? 43 : $id_cliente.hashCode());
        Object $id_vendedor = this.getId_vendedor();
        result = result * 59 + ($id_vendedor == null ? 43 : $id_vendedor.hashCode());
        return result;
    }
   

   @Generated
   public String toString() {
        int var1 = this.getId_usuario();
      return "Usuario(id_usuario=" + var1 + this.getId_usuario() + ", correo_usuario=" + this.getCorreo_usuario() + ", contraseña_usuario=" + this.getContraseña_usuario() + ", id_rol=" + this.getId_rol() + ")";
    }

    @Generated
    public Usuario(final int id_usuario, final String correo_usuario, final String contraseña_usuario, final int id_rol) {
          this.id_usuario = id_usuario;
          this.correo_usuario = correo_usuario;
          this.contraseña_usuario = contraseña_usuario;
          this.id_rol = id_rol;
     }

   @Generated
   public Usuario() {
   }
   
}
