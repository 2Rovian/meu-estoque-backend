package com.meuestoque.meuestoque.controllers;
import com.meuestoque.meuestoque.entities.ProdutoEntity;
import com.meuestoque.meuestoque.services.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@AllArgsConstructor
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoEntity> produtos(){
        return produtoService.mostrarProdutos();
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
