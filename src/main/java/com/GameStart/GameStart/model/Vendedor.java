package com.GameStart.GameStart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="vendedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vendedor;

    @Column(nullable=true)
    private String nombre_vendedor;

    @Column(nullable=true)
    private String correo_vendedor;

    @Column(nullable=false)
    private String telefono_vendedor;
}
