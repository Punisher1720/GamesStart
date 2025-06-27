package com.GameStart.GameStart.Repository;

import org.springframework.stereotype.Repository;
import com.GameStart.GameStart.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByCodCliente(String cod_cliente);
}
