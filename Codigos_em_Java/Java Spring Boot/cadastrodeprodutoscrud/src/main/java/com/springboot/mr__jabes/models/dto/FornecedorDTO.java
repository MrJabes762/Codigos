package com.springboot.mr__jabes.models.dto;

import java.util.List;

import com.springboot.mr__jabes.models.Produto;

import jakarta.persistence.ManyToMany;

public class FornecedorDTO {
    private Long id;
    private String nome;
    @ManyToMany(mappedBy = "fornecedores")
    private List<Produto> produtos;

    public FornecedorDTO() {
    }

    public FornecedorDTO(String nome) {
        this.nome = nome;
    }

    public FornecedorDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
