package com.springboot.mr__jabes.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mr__jabes.models.CategoriaProduto;
import com.springboot.mr__jabes.models.Produto;
import com.springboot.mr__jabes.models.dto.FornecedorDTO;
import com.springboot.mr__jabes.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaProdutoService categoriaProdutoService;
    @Autowired
    private FornecedorService fornecedorService;

    public Produto create (@Valid Produto produto){// Produto Comum sem a categoria 
        return getProdutoRepository().save(produto);
    }
    public Produto create (@Valid Produto produtoRecebido, Long idDaCategoria){// sobrecarga produto Com o Acrescimo da Categoria
        produtoRecebido.setCategoria(getCategoriaProdutoService().getCategoria(idDaCategoria));
        return getProdutoRepository().save(produtoRecebido);
    }
    public Produto create (@Valid Produto produtoRecebido, Long idDaCategoria, Long idDoFornecedor){// sobrecarga produto com o acrecimo da categoria e do fornecedor
        produtoRecebido.setCategoria(getCategoriaProdutoService().getCategoria(idDaCategoria));
        produtoRecebido.getFornecedores().add(getFornecedorService().getFornecedor(idDoFornecedor));
        return getProdutoRepository().save(produtoRecebido);
    }
    public List<Produto> list(){
        return getProdutoRepository().findAll();
    }
    public List<CategoriaProduto> listaCategorias (){
        return getCategoriaProdutoService().list();
    }
    public List<FornecedorDTO> listaFornecedores (){
        return getFornecedorService().listaDeFornecedoresExemplo();
    }
    public Produto update(@Valid Produto produto) {// produto normal
        Produto produtoDoBanco = getProdutoRepository().findById(produto.getId()).orElse(null);
        if (produtoDoBanco != null) {
            produtoDoBanco.setDescricao(produto.getDescricao());
            produtoDoBanco.setNome(produto.getNome());
            produtoDoBanco.setPreco(produto.getPreco());
            produtoDoBanco.setUnidadeMedida(produto.getUnidadeMedida());
            produtoDoBanco.setDataCadastro(produto.getDataCadastro());
            produtoDoBanco.setCodigoBarras(produto.getCodigoBarras());
            produtoDoBanco.setAtivo(produto.getAtivo());
            return getProdutoRepository().save(produtoDoBanco);
        }
        return null;
    }
    public Produto update(@Valid Produto produto, Long idDaCategoria) {// sobrecarga de um produto com a categoria
        Produto produtoDoBanco = getProdutoRepository().findById(produto.getId()).orElse(null);
        if (produtoDoBanco != null) {
            produtoDoBanco.setDescricao(produto.getDescricao());
            produtoDoBanco.setNome(produto.getNome());
            produtoDoBanco.setPreco(produto.getPreco());
            produtoDoBanco.setUnidadeMedida(produto.getUnidadeMedida());
            produtoDoBanco.setDataCadastro(produto.getDataCadastro());
            produtoDoBanco.setCodigoBarras(produto.getCodigoBarras());
            produtoDoBanco.setCategoria(getCategoriaProdutoService().getCategoria(idDaCategoria));
            produtoDoBanco.setAtivo(produto.getAtivo());
            return getProdutoRepository().save(produtoDoBanco);
        }
        return null;
    }
    public void delete (Long id){
        if(getProdutoRepository().existsById(id)){
            getProdutoRepository().deleteById(id);
        }
    }
    public Produto getProduto(Long idDoProduto) {
        if(getProdutoRepository().existsById(idDoProduto)){
            return getProdutoRepository().findById(idDoProduto).orElse(null);
        }
        return null;
    }
    public ProdutoRepository getProdutoRepository() {
        return this.produtoRepository;
    }
    public CategoriaProdutoService getCategoriaProdutoService() {
        return categoriaProdutoService;
    }
    public FornecedorService getFornecedorService() {
        return this.fornecedorService;
    }
}
