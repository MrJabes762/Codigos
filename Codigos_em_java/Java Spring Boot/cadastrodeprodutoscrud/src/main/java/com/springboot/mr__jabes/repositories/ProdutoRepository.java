package com.springboot.mr__jabes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mr__jabes.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}

