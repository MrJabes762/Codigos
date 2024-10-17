package com.springboot.mr__jabes.controllers;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.mr__jabes.models.CategoriaProduto;
import com.springboot.mr__jabes.models.Produto;
import com.springboot.mr__jabes.models.dto.FornecedorDTO;
import com.springboot.mr__jabes.service.ProdutoService;


@Controller
@RequestMapping("/Produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoSetvice;

    //ABRE A PÁGINA DE CADASTRO
    @GetMapping("/CadProduto")
    public String cadastroProdutosPagina(Model model){
        List<CategoriaProduto> categorias = getProdutoService().listaCategorias();
        List<FornecedorDTO> fornecedores = getProdutoService().listaFornecedores();
        model.addAttribute("categorias",categorias);
        model.addAttribute("fornecedores", fornecedores);
        return "CadastroDeProdutos";
    }

    //ABRE A PÁGINA DE VER OS PRODUTOS
    @GetMapping("/ListaDeProdutos")
    public ModelAndView verProdutos(){
        List<Produto> _produtos = getProdutoService().list();
        ModelAndView modelAndView = new ModelAndView("ListaDeProdutos");
        modelAndView.addObject("produtos", _produtos);
        return modelAndView;
    }

    //CADSTRO DE PRODUTOS
    @PostMapping("/ListaDeProdutosCad")
    public ModelAndView  cadastroProduto(
    @RequestParam("nome") String nome, 
    @RequestParam("descricao") String descricao,
    @RequestParam("codigoBarras") String codigoBarras,
    @RequestParam("preco") double preco,
    @RequestParam("unidadeMedida") String unidadeMedida,
    @RequestParam("dataCadastro") LocalDate dataCadastro,
    @RequestParam ("idDaCategoria") long idDaCategia,
    @RequestParam ("idDoFornecedor") long idDoFornecedor,
    @RequestParam(name = "ativo", defaultValue = "false") boolean ativo
    ){
        Produto tempProduto = new Produto(nome,descricao,codigoBarras, preco, 
        unidadeMedida, dataCadastro, ativo);
        getProdutoService().create(tempProduto,idDaCategia, idDoFornecedor); //idDoFornecedor
        ModelAndView modelAndView = new ModelAndView("redirect:/Produtos/ListaDeProdutos");
        return modelAndView;
    }

    //DELETAR OS PRODUTOS 
    @PostMapping("delete/{id}")
    public ModelAndView apagarProduto(@PathVariable Long id){
        getProdutoService().delete(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/Produtos/ListaDeProdutos");
        return modelAndView;

    }

    //EDITAR OS PRODUTOS PARA APAGAR, IRA ABRIR UMA PÁGINA NOVA 
    @PostMapping("/editar/{id}")
        public ModelAndView editarProduto(@PathVariable Long id, Model model) {
            Produto produto = getProdutoService().getProduto(id);
            ModelAndView modelAndView = new ModelAndView("EditarProduto"); 
            modelAndView.addObject("produtoAntigo", produto);
            List<CategoriaProduto> categorias = getProdutoService().listaCategorias();
            model.addAttribute("categorias", categorias);
            return modelAndView;
}

//AINDA EDITANDO, PEGA OS CAMPOS DO FORM DE EDIÇÃO E OS SALVA EM UM NOVO PRODUTO E POR FIM OS ATUALIZA
@PostMapping("/atualizar")
public ModelAndView atualizarProduto(
        @RequestParam("id") Long id,
        @RequestParam("nome") String nome, 
        @RequestParam("descricao") String descricao,
        @RequestParam("codigoBarras") String codigoBarras,
        @RequestParam("preco") double preco,
        @RequestParam("unidadeMedida") String unidadeMedida,
        @RequestParam("dataCadastro") LocalDate dataCadastro,
        @RequestParam("idDaCategoria") long idDaCategoria,
        @RequestParam(name = "ativo", defaultValue = "false") boolean ativo) {
    
        Produto novoProduto = new Produto(id,nome, descricao, codigoBarras, preco, unidadeMedida, dataCadastro, ativo);
        getProdutoService().update(novoProduto,idDaCategoria);
        ModelAndView modelAndView = new ModelAndView("redirect:/Produtos/ListaDeProdutos"); 
        return modelAndView;
}

    public ProdutoService getProdutoService() {
        return this.produtoSetvice;
    }

}
