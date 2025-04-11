package com.springboot.mr__jabes.models;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@SuppressWarnings("unused")
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    @NotNull(message = "Campo Obrigatorio")
    private Produto produto;
    @NotNull(message = "Campo Obrigatorio")
    private int quantidade;
    @NotNull(message = "Campo Obrigatorio")
    private LocalDate dataUltimaAtualizacao;
    @NotBlank(message = "Campo Obrigatorio")
    private String localizacao;


    public Estoque() {
    }

    public Estoque(int quantidade, LocalDate dataUltimaAtualizacao, String localizacao) {
        setQuantidade(quantidade);
        setDataUltimaAtualizacao(dataUltimaAtualizacao);
        setLocalizacao(localizacao);
    }


    public Estoque(Produto produto, int quantidade, LocalDate dataUltimaAtualizacao, String localizacao) {
        setProduto(produto);
        setQuantidade(quantidade);
        setDataUltimaAtualizacao(dataUltimaAtualizacao);
        setLocalizacao(localizacao);
    }

    public Estoque(@Valid Long id2, int quantidade2, LocalDate dataUltima, String localizacao2) {
        setId(id2);
        setQuantidade(quantidade2);
        setDataUltimaAtualizacao(dataUltima);
        setLocalizacao(localizacao2);
    }

    public Long getId() {
        return this.id;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return this.dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
