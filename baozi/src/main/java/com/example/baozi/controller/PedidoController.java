package com.example.baozi.controller;

import com.example.baozi.model.Pedido;
import com.example.baozi.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping
    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscarPedidoId(@PathVariable Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido){
        Pedido pedidoExistente = pedidoRepository.findById(id).orElse(null);

        if(pedidoExistente == null){
            return null;
        }

        pedidoExistente.setQuantidade(pedido.getQuantidade());
        return pedidoRepository.save(pedidoExistente);
    }
    
    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        pedidoRepository.deleteById(id);
    }
}
