package com.GameStart.GameStart.service;

import com.GameStart.GameStart.repository.Descuento;
import com.GameStart.GameStart.repository.DescuentoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DescuentoService {
    @Autowired
    private DescuentoRepository descuentoRepository;

    public DescuentoService(){
    }

    public List<Descuento> findAll() {
        return this.descuentoRepository.findAll();
    }

    public Descuento findById(Long id) {
        return this.descuentoRepository.findById(id).orElse(null);
    }

    public Descuento save(Descuento descuento) {
        return this.descuentoRepository.save(descuento);
    }

    public void deleteById(Long id) {
        this.descuentoRepository.deleteById(id);
    }
    

}
