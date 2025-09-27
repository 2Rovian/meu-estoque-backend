package com.meuestoque.meuestoque.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_produtos")
@Getter
@Setter
@NoArgsConstructor
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public ProdutoEntity(Double price, Integer quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    @Column(nullable = false)
    private String name;
    private Double price;
    private Integer quantity = 1;
}
