package com.springboot.mr__jabes.models;

import jakarta.persistence.Entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;


@SuppressWarnings("unused")
@Entity
public class CategoriaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Campos Obrigatorios")
    private String nome;
    @NotBlank(message = "Campos Obrigatorios ")
    private String descricao;
    @OneToMany(mappedBy = "categoria")
    private List<Produto>produtos;



    public CategoriaProduto (String nome, String descricao){
        setNome(nome);
        setDescricao(descricao);
    }
    
    public CategoriaProduto(Long id, String nome, String descricao) {
        setId(id);
        setNome(nome);
        setDescricao(descricao);
    }
    public CategoriaProduto() {
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

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

}