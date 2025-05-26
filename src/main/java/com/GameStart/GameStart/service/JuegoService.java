package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.repository.JuegoRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JuegoService {
    @Autowired
    private JuegoRepository juegorepository;

    public JuegoService() {
    }

    public List<Juego> findAll() {
        return this.juegorepository.findAll();
    }

    public Juego findById(Long cod_juego) {
        return this.juegorepository.findById(cod_juego).orElse(null);
    }

    public Juego save(Juego juego) {
        return this.juegorepository.save(juego);
    }   

    public void deleteById(Long cod_juego) {
    this.juegorepository.deleteById(cod_juego);
    }

}    
