package com.example.baozi.controller;

import com.example.baozi.model.Produto;
import com.example.baozi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    //    Produto
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listaProduto() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarProdutoId(@PathVariable Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoExistente = produtoRepository.findById(id).orElse(null);

        if (produtoExistente == null) {
            return null;
        }

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setEstoque(produto.getEstoque());

        return produtoRepository.save(produtoExistente);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){

        produtoRepository.deleteById(id);
    }
}
