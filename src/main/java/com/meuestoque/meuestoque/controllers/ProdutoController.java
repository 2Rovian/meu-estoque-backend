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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProdutoEntity> mostrarProdutos(
            @RequestParam(required = false, name = "nome") String nome,
            @RequestParam(required = false, name = "categoria") String categoria
    ) {
        if(nome != null && !nome.isEmpty()) {
            return produtoService.mostrarProdutoPorNome(nome);
        } else if(categoria != null && !categoria.isEmpty()){
            return produtoService.mostrarProdutoPorCategoria(categoria);
        }
        return produtoService.mostrarProdutos();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Optional<ProdutoEntity> produtoUnico(@PathVariable Long id){
        return produtoService.mostrarProdutoPorId(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ProdutoEntity criarProduto(@RequestBody ProdutoEntity body){
        return produtoService.criarProduto(body);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public String excluirProduto(@PathVariable Long id) {
        return produtoService.excluirProduto(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public ResponseEntity editarProduto(@PathVariable(name = "id") Long id, @RequestBody ProdutoEntity body){
        return produtoService.editarProduto(id, body);
    }
}
