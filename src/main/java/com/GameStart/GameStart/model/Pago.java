package com.GameStart.GameStart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pago {

private int id_pago;
private String metodo_pago;
private String estado_pago;

}
