package com.GameStart.GameStart.Repository;

import com.GameStart.GameStart.model.Juego;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JuegoRepository extends JpaRepository<Juego, Long> {
    Juego finfindByCodJuego(String cod_juego);
}
