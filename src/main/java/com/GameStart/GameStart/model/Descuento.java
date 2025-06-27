package com.GameStart.GameStart.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Descuento")

public class Descuento {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @Column(nullable = false, length = 50)
   private Integer id_descuento;

   @Column(nullable = false, length = 50)
   private Integer descuento_juego;


}
