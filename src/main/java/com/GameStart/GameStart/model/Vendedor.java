package com.GameStart.GameStart.model;

import lombok.Generated;

public class Vendedor {

    private String id_vendedor;
    private String nombre_vendedor;
    private String correo_vendedor;
    private String telefono_vendedor;

    @Generated
    public String getId_vendedor() {
        return id_vendedor;
    }

    @Generated
    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    @Generated
    public String getCorreo_vendedor() {
        return correo_vendedor;
    }

    @Generated
    public String getTelefono_vendedor() {
        return telefono_vendedor;
    }

    @Generated
    public void setId_vendedor(final String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    @Generated
    public void setNombre_vendedor(final String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    @Generated
    public void setCorreo_vendedor(final String correo_vendedor) {
        this.correo_vendedor = correo_vendedor;
    }

    @Generated
    public void setTelefono_vendedor(final String telefono_vendedor) {
        this.telefono_vendedor = telefono_vendedor;
    }

     @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Vendedor)) {
         return false;
      } else {
         Vendedor other = (Vendedor)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getId_vendedor() != other.getId_vendedor()) {
            return false;
         } else if (this.getId_vendedor() != other.getId_vendedor()) {
            return false;
         } else {
            {
               Object this$nombre_vendedor = this.getNombre_vendedor();
               Object other$nombre_vendedor = other.getNombre_vendedor();
               if (this$nombre_vendedor == null) {
                  if (other$nombre_vendedor == null) {
                     break;
                  }
               } else if (this$nombre_vendedor.equals(other$nombre_vendedor)) {
                  break;
               }

               return false;
            }

            Object this$correo_vendedor = this.getCorreo_vendedor();
            Object other$correo_vendedor = other.getCorreo_vendedor();
            if (this$correo_vendedor == null) {
               if (other$correo_vendedor != null) {
                  return false;
               }
            } else if (!this$correo_vendedor.equals(other$correo_vendedor)) {
               return false;
            }

            {
               Object this$telefono_vendedor = this.getTelefono_vendedor();
               Object other$telefono = other.getTelefono_vendedor();
               if (this$telefono_vendedor == null) {
                  if (other$telefono == null) {
                     break;
                  }
               return false;
            }
         }
      }
   }

    
}


