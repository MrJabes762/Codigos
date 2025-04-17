package com.springboot.mr__jabes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mr__jabes.models.Estoque;
import com.springboot.mr__jabes.models.Produto;
import com.springboot.mr__jabes.repositories.EstoqueRepository;

import jakarta.validation.Valid;

@Service
public class EstoqueService {
    
    @Autowired
    private EstoqueRepository estoqueRepository;
    @Autowired
    private ProdutoService produtoService;

    public Estoque create (@Valid Estoque estoque){
        Estoque estoqueDoBanco = getEstoqueRepository().save(estoque);
        return estoqueDoBanco;
    }
// Essa Sobrecarga eu vou pegar o ID do produto e vou olhar no repositorio de produtos e pegar o ID do Associado a ele e salvar no produto recebido
    public Estoque create(@Valid Estoque estoqueRecebido, Long idDoProduto) {
        Produto produtoDoId = getProdutoService().getProduto(idDoProduto);
        estoqueRecebido.setProduto(produtoDoId);
        Estoque estoqueDoBanco = getEstoqueRepository().save(estoqueRecebido);
        return estoqueDoBanco;
    }
    
    public List<Estoque> list (){
        return getEstoqueRepository().findAll();
    }
    public List<Produto> listaDeProdutos(){
        return getProdutoService().list();
    }

    public Estoque update (@Valid Estoque estoque){
        Estoque estoqueDoBanco = getEstoqueRepository().findById(estoque.getId()).orElse(null);
        if(estoqueDoBanco != null){
            estoqueDoBanco.setQuantidade(estoque.getQuantidade());
            estoqueDoBanco.setDataUltimaAtualizacao(estoque.getDataUltimaAtualizacao());
            estoqueDoBanco.setLocalizacao(estoque.getLocalizacao());
            return getEstoqueRepository().save(estoqueDoBanco);
        }
        return null;
    }
    public Estoque update(@Valid Estoque estoqueRecebido, Long iddoProduto) {
        estoqueRecebido.setProduto(getProdutoService().getProduto(iddoProduto));
        Estoque estoqueDoBanco = getEstoqueRepository().findById(estoqueRecebido.getId()).orElse(null);
        if(estoqueDoBanco != null){
            estoqueDoBanco.setQuantidade(estoqueRecebido.getQuantidade());
            estoqueDoBanco.setDataUltimaAtualizacao(estoqueRecebido.getDataUltimaAtualizacao());
            estoqueDoBanco.setLocalizacao(estoqueRecebido.getLocalizacao());
            estoqueDoBanco.setProduto(estoqueRecebido.getProduto());
            return getEstoqueRepository().save(estoqueDoBanco);
        }
        return null;
    }

    public void delete (Long id){
        if (getEstoqueRepository().existsById(id)){
            getEstoqueRepository().deleteById(id);
        }
    }


    public EstoqueRepository getEstoqueRepository() {
        return this.estoqueRepository;
    }

    public ProdutoService getProdutoService() {
        return produtoService;
    }
}
