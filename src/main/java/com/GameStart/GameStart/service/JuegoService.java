package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.Repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    public Optional<Juego> buscarPorId(Long id) {
        return juegoRepository.findById(id);
    }

    public Juego guardar(Juego juego) {
        return juegoRepository.save(juego);
    }

    public void eliminar(Long id) {
        juegoRepository.deleteById(id);
    }

    public Optional<Juego> buscarPorCodJuego(String cod_juego) {
        return Optional.ofNullable(juegoRepository.finfindByCodJuego(cod_juego));
    }
}    
