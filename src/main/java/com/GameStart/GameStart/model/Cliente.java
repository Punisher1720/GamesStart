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
@Table(name="Cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_cliente;

    @Column(nullable = false, length= 100)
    private String nombre_cliente;

    @Column(nullable = false, length= 100)
    private String correo_cliente;

    @Column(nullable = false, length= 100)
    private String telefono_cliente;
   

}
