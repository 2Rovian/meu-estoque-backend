package com.meuestoque.meuestoque.repositories;

import com.meuestoque.meuestoque.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    List<ProdutoEntity> findProductByNameContaining(String name);
}
