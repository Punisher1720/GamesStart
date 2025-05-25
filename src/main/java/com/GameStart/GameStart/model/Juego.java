package com.GameStart.GameStart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table (name = "juego")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_juego;

    @Column(nullable = true)
    private String nombre_juego;

    @Column(nullable = true)
    private String genero_juego;

    @Column(nullable = true)
    private int stock_juego;
    
    @Column(nullable = true)
    private int precio_juego;

    @Column(nullable = true)
    private int descuento_id_juego;

    @Column(nullable = true)
    private int venta_id_venta;

    


}
