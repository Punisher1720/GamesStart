package com.GameStart.GameStart.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="soporte")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Soporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ticket;

    @Column(nullable=true)
    private String razon_ticket;

    @Column(nullable=true)
    private String desc_msg_ticket;

    @ManyToMany
    private Cliente cliente;

}