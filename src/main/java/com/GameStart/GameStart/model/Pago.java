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
@Table(name="Pago")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Pago {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pago_id;

    @Column(nullable = false, length = 30)
    private String metodo_pago;

    @Column(nullable = false, length = 30)
    private String estado_pago;
    
    @ManyToOne
    private Venta venta;

}
