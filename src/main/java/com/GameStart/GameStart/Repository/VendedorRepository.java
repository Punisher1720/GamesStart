package com.GameStart.GameStart.Repository;

import org.springframework.stereotype.Repository;
import com.GameStart.GameStart.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

    @Repository
    public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
        Vendedor findByCodVendedor(String cod_vendedor);
    }


