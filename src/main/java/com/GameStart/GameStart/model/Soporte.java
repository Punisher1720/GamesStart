package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Soporte {

private int id_ticket;
private String razon_ticket;
private String desc_msg_ticket;
private int cliente_id_cliente;
private int vendedor_id_vendedor;
    
}