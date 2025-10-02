package com.meuestoque.meuestoque.services;
import com.meuestoque.meuestoque.entities.ProdutoEntity;
import com.meuestoque.meuestoque.repositories.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoEntity> mostrarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoEntity> mostrarProdutoPorId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoEntity criarProduto(ProdutoEntity novoProduto){
        return produtoRepository.save(novoProduto);
    }

    public String excluirProduto(Long id) {
        produtoRepository.deleteById(id);
        return "Produto de id " + id + " excluído";
    }

    public ResponseEntity<?> editarProduto(Long id, ProdutoEntity produto) {
        Optional<ProdutoEntity> produtoAtual = produtoRepository.findById(id);
        if(produtoAtual.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found product");
        }
        var produtoEditado = produtoAtual.get();
        BeanUtils.copyProperties(produto, produtoEditado, "id");
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produtoEditado));
    }
}
