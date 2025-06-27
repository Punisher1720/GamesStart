package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Pago;
import com.GameStart.GameStart.model.Vendedor;
import com.GameStart.GameStart.Repository.PagoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> findAll() {
        return pagoRepository.findAll();
    }

    public Pago findById(Long id) {
        return pagoRepository.findById(id).orElse(null);
    }

    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }

    public void delete(Long id) {
        pagoRepository.deleteById(id);
    }

    public Pago findById(Long id, Pago pago) {
        Pago pagoExistente = pagoRepository.findById(id).orElse(null);
        if (pagoExistente != null) {
            pagoExistente.setEstado_pago(pago.getEstado_pago());
            pagoExistente.setMetodo_pago(pago.getMetodo_pago());
            pagoExistente.setVenta(pago.getVenta());
            return pagoRepository.save(pagoExistente);
        }
        return null;
    }


}
