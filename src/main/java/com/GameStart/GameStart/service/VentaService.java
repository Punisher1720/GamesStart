package com.GameStart.GameStart.service;

import java.util.List;
import java.util.Optional;

import com.GameStart.GameStart.model.Venta;
import com.GameStart.GameStart.Repository.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
    
    public void guardarVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    public Optional<Venta> buscarVentaPorId(Long id) {
        return ventaRepository.findById(id);
    }

    public void actualizarVenta(Integer id, Venta datosactualizados) {
        Optional<Venta> ventaExistente = ventaRepository.findById(venta.getId());
        if (ventaExistente.isPresent()) {
            Venta v = ventaExistente.get();
            v.setCodVenta(datosactualizados.getCodVenta());
            v.setFecha(datosactualizados.getFecha());
            v.setPrecioTotal(datosactualizados.getPrecioTotal());
            v.setCliente(datosactualizados.getCliente());
            v.setJuego(datosactualizados.getJuego());
            ventaRepository.save(v);
        }
    }




}

