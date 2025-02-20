package com.websocket.websockets.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@SuppressWarnings("unused")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Campos Obrigatorios")
    private String nome;
    @NotBlank(message = "Campos Obrigatorios")
    private String descricao;
    @NotBlank(message = "Campos Obrigatorios")
    private String codigoBarras;
    @NotNull
    private double preco;
    @NotBlank (message = "Campos Obrigatorios")
    private String unidadeMedida;
    @NotNull (message = "Campos Obrigatorios")
    private String categoria;
    @NotNull (message = "Campos Obrigatorios")
    private String dataCadastro;
    private Boolean ativo;


    public Produto() {
    }
    public Produto(String nome, String descricao, String codigoBarras, double preco, 
    String unidadeMedida, String string, Boolean ativo) {
        setNome(nome);
        setDescricao(descricao);
        setCodigoBarras(codigoBarras);
        setPreco(preco);
        setUnidadeMedida(unidadeMedida);
        setDataCadastro(string);
        setAtivo(ativo);
    }

    public Produto( Long id2, String nome2, String descricao2, String codigoBarras2, double preco2,
            String unidadeMedida2, String dataCadastro2, boolean ativo2) {
        setId(id2);
        setNome(nome2);
        setDescricao(descricao2);
        setCodigoBarras(codigoBarras2);
        setPreco(preco2);
        setUnidadeMedida(unidadeMedida2);
        setDataCadastro(dataCadastro2);
        setAtivo(ativo2);
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

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidadeMedida() {
        return this.unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean isAtivo() {
        return this.ativo;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}