package com.meuestoque.meuestoque.controllers;
import com.meuestoque.meuestoque.entities.ProdutoEntity;
import com.meuestoque.meuestoque.services.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
@AllArgsConstructor
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> produtos(){
        return ResponseEntity.ok(produtoService.mostrarProdutos());
    }
    
    @GetMapping("/{id}")
    public Optional<ProdutoEntity> produtoUnico(@PathVariable Long id){
        return produtoService.mostrarProdutoPorId(id);
    }

    @PostMapping
    public ProdutoEntity criarProduto(@RequestBody ProdutoEntity body){
        return produtoService.criarProduto(body);
    }

    @DeleteMapping("/{id}")
    public String excluirProduto(@PathVariable Long id) {
        return produtoService.excluirProduto(id);
    }
}
