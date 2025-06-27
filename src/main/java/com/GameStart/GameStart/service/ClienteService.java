package com.GameStart.GameStart.service;

import org.springframework.stereotype.Service;
import com.GameStart.GameStart.model.Cliente;
import com.GameStart.GameStart.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
 
import java.util.List;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findByCodCliente(String id_cliente) {
        return clienteRepository.findByCodCliente(id_cliente);
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente findById(Long id, Cliente cliente) {
        Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setId_cliente(cliente.getId_cliente());
            clienteExistente.setNombre_cliente(cliente.getNombre_cliente());
            clienteExistente.setCorreo_cliente(cliente.getCorreo_cliente());
            clienteExistente.setTelefono_cliente(cliente.getTelefono_cliente());
            
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }

}
