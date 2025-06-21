package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.Repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;


    public List<Juego> findAll() {
        return juegoRepository.findAll();
    }

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

    public void actualizar(Long id, Juego juego) {
        Optional<Juego> juegoExistente = juegoRepository.findById(id);
        if (juegoExistente.isPresent()) {
            Juego juegoActualizado = juegoExistente.get();
            juegoActualizado.setCod_juego(juego.getCod_juego());
            juegoActualizado.setNombre_juego(juego.getNombre_juego());
            juegoActualizado.setGenero_juego(juego.getGenero_juego());
            juegoActualizado.setStock_juego(juego.getStock_juego());
            juegoActualizado.setPrecio_juego(juego.getPrecio_juego());
            juegoActualizado.setDescuento_id_descuento(juego.getDescuento_id_descuento());
            juegoActualizado.setVenta_id_venta(juego.getVenta_id_venta());
            juegoRepository.save(juegoActualizado);
        }
    }
}    
