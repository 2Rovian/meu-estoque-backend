package com.meuestoque.meuestoque.services;
import com.meuestoque.meuestoque.entities.ProdutoEntity;
import com.meuestoque.meuestoque.repositories.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoEntity> mostrarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoEntity criarProduto(ProdutoEntity novoProduto){
        return produtoRepository.save(novoProduto);
    }

    public String excluirProduto(Long id) {
        produtoRepository.deleteById(id);
        return "Produto de id " + id + " excluído";
    }
}
