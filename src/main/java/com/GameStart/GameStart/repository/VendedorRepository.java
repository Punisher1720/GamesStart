package com.GameStart.GameStart.repository;

import com.GameStart.GameStart.model.Vendedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
