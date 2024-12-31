package com.springboot.mr__jabes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mr__jabes.models.CategoriaProduto;
import com.springboot.mr__jabes.repositories.CategoriaProdutoRepository;

import jakarta.validation.Valid;

@Service
public class CategoriaProdutoService {
    @Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    public CategoriaProduto create (@Valid CategoriaProduto categoriaProduto){
        CategoriaProduto categoriaDoBanco = getCategoriaProdutoRepository().save(categoriaProduto);
        return categoriaDoBanco;
    }

    public List<CategoriaProduto> list (){
        return getCategoriaProdutoRepository().findAll();
    }

    public CategoriaProduto update (@Valid CategoriaProduto categoriaProduto){
        CategoriaProduto categoriaProdutoDoBanco = getCategoriaProdutoRepository().findById(categoriaProduto.getId()).orElse(null);
        if(categoriaProdutoDoBanco != null){
            categoriaProdutoDoBanco.setNome(categoriaProduto.getNome());
            categoriaProdutoDoBanco.setDescricao(categoriaProduto.getDescricao());
            return getCategoriaProdutoRepository().save(categoriaProdutoDoBanco);
        }
        return null;
    }
    public void delete (Long id){
        if (getCategoriaProdutoRepository().existsById(id)){
            getCategoriaProdutoRepository().deleteById(id);
        }
    }

    public CategoriaProduto getCategoria (Long idDaCategoria){
        return getCategoriaProdutoRepository().findById(idDaCategoria).orElse(null);
    }

    public CategoriaProdutoRepository getCategoriaProdutoRepository() {
        return categoriaProdutoRepository;
    }
}
