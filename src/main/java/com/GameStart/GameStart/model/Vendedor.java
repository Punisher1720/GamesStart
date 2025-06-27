package com.GameStart.GameStart.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Vendedor")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vendedor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_vendedor;

    @Column(nullable = false, length= 100)
    private String nombre_vendedor;

    @Column(nullable = false, length= 100)
    private String correo_vendedor;

    @Column(nullable = false, length= 100)
    private String telefono_vendedor;
   

}
