package com.GameStart.GameStart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "venta")
@NoArgsConstructor
@AllArgsConstructor

public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_venta;

    @Column(nullable = false, length = 100)
    private Integer precio_total;

    @Column(nullable = false, length = 100)
    private Integer cantidad_ventas_juego;

    @Column(nullable = false, length = 100)
    private Integer pago_id_pago;

    @Column(nullable = false, length = 100)
    private Integer cliente_id_cliente;

}
