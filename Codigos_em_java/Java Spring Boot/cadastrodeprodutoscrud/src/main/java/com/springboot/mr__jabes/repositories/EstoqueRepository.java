package com.springboot.mr__jabes.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mr__jabes.models.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque,Long>{
    
}
