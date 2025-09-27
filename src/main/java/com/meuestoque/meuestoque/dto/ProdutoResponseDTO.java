package com.meuestoque.meuestoque.dto;

import com.meuestoque.meuestoque.entities.ProdutoEntity;

public record ProdutoResponseDTO(Long id, String name, Double price, Integer quantity) {
    public ProdutoResponseDTO(ProdutoEntity produto){
        this(produto.getId(), produto.getName(), produto.getPrice(), produto.getQuantity());
    }
}
