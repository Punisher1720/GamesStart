package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.Repository.JuegoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JuegoService {
    @Autowired
    private JuegoRepository juegoRepository;

    public JuegoService() {
    }

    public List<Juego> findAll() {
        return this.juegoRepository.findAll();
    }

    public Juego findById(Integer cod_juego) {
        return this.juegoRepository.findById(cod_juego).orElse(null);
    }

    public Juego save(Juego juego) {
        return (Juego) this.juegoRepository.save(juego);
    }   

    public void deleteById(Long cod_juego) {
        this.juegoRepository.deleteById(cod_juego);
    }

}    
