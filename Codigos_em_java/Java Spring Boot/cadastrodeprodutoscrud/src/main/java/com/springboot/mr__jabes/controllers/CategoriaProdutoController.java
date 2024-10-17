package com.springboot.mr__jabes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.mr__jabes.models.CategoriaProduto;
import com.springboot.mr__jabes.service.CategoriaProdutoService;

@Controller
@RequestMapping("/Categoria")
public class CategoriaProdutoController {
    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    //ABRE A PÁGINA DE CADASTRO DE CATEGORIA
    @GetMapping("/CadCategoriaProduto")
    public String CadastroCategoriaProdutoPagina(){
        return "CadastroDeCategorias";
    }

    //ABRE A PÁGINA DE VER OS PRODUTOS
    @GetMapping("/ListaDeCategoriasProdutos")
    public ModelAndView verCategorias (){
        List<CategoriaProduto> categorias = getCategoriaProdutoService().list();
        ModelAndView modelAndView = new ModelAndView("ListadeCategorias");
        modelAndView.addObject("categorias", categorias);
        return modelAndView;
    }

    //CADASTRAR CATEGORIAS
    @PostMapping("/ListaDeCategoriasProdutoCad")
    public ModelAndView cadastrarCategoriaProduto (
    @RequestParam("nome") String nome,
    @RequestParam("descricao") String descricao) {
        CategoriaProduto categoriaRecebida = new CategoriaProduto (nome, descricao);
        getCategoriaProdutoService().create(categoriaRecebida);
        ModelAndView modelAndView = new ModelAndView ("redirect:/Categoria/ListaDeCategoriasProdutos");
        return modelAndView;
    }

    //DELETAR CATEGORIA
    @PostMapping("delete/{id}")
    public ModelAndView apagarCategoria (@PathVariable Long id){
        getCategoriaProdutoService().delete(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/Categoria/ListaDeCategoriasProdutos");
        return modelAndView;
    }


    // EDITAR AS CATEGORAIS PARA APAGAR, IRA ABRIR UMA PAGINA NOVA 
    @PostMapping("/editar/{id}")
    public ModelAndView editarCategorias (@PathVariable Long id) {
        Optional<CategoriaProduto> _categorias = getCategoriaProdutoService().getCategoriaProdutoRepository().findById(id);
        CategoriaProduto categoria = _categorias.get();
        ModelAndView modelAndView = new ModelAndView("EditarCategorias");
        modelAndView.addObject("categoriaAntiga", categoria);
        return modelAndView;
    }

    //AINDA EDITANDO PEGA OS CAMPOS DO FORM DE EDIÇAO E SALVA EM UM NOVO ESTOQUE E POR FIM ATUALIZA 

    @PostMapping("/atualizar")
    public ModelAndView atualizarCategoria(
        @RequestParam ("id") Long id,
        @RequestParam ("nome") String nome,
        @RequestParam ("descricao") String descricao) {
        CategoriaProduto categoriaProdutoRecebida = new CategoriaProduto(id, nome, descricao);
        getCategoriaProdutoService().update(categoriaProdutoRecebida);
        ModelAndView modelAndView = new ModelAndView("redirect:/Categoria/ListaDeCategoriasProdutos");
        return modelAndView;
    }
    public CategoriaProdutoService getCategoriaProdutoService() {
        return categoriaProdutoService;
    }
}
