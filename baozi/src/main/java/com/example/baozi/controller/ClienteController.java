package com.example.baozi.controller;

import com.example.baozi.model.Cliente;
import com.example.baozi.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
//    Cliente
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listarCliente() {

        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarClienteId(@PathVariable Long id) {

        return clienteRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clienteRepository.findById(id).orElse(null);

        if (clienteExistente == null) {
            return null;
        }

        clienteExistente.setNome(cliente.getNome());
        clienteExistente.setClienteDesde(cliente.getClienteDesde());

        return clienteRepository.save(clienteExistente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

}
