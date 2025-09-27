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
    private ProdutoRepository produto;

//    public List<ProdutoResponseDTO> mostrarProdutos(){
//        List<ProdutoEntity> entities = produto.findAll();
//
//        return entities.stream().map(ProdutoResponseDTO::new).toList();
//    }

    public List<ProdutoEntity> mostrarProdutos(){
        return produto.findAll();
    }

    public ProdutoEntity criarProduto(ProdutoEntity novoProduto){
        return  produto.save(novoProduto);
    }

}
