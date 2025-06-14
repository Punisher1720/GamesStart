package com.GameStart.GameStart.model;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table (name = "juego")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Juego {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(nullable = false, length= 10)
   private Integer cod_juego;

   @Column(nullable = false, length= 100)
   private String nombre_juego;

   @Column(nullable = false, length= 50)
   private String genero_juego;

   @Column(nullable = false, length=30)
   private Integer stock_juego;

   @Column(nullable = false, length= 100)
   private Integer precio_juego;

   @Column(nullable = false, length=30)
   private Integer descuento_id_descuento;

   @Column(nullable = false, length=30)
   private Integer venta_id_venta;


   

    
}
