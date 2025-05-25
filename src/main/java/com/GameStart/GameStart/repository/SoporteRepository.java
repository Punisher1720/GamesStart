package com.GameStart.GameStart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GameStart.GameStart.model.Soporte;

@Repository
public interface SoporteRepository extends JpaRepository<Soporte, Long> {
}
