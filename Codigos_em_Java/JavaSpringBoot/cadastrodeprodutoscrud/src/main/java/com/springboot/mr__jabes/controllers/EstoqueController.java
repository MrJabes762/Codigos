package com.springboot.mr__jabes.controllers;

import com.springboot.mr__jabes.models.Estoque;
import com.springboot.mr__jabes.models.Produto;
import com.springboot.mr__jabes.service.EstoqueService;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/Estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;
    

    //ABRE A PÁGINA DE CADASTRO DE ESTOQUE
    @GetMapping("/CadEstoque")
    public String CadastroEstoquePagina(Model model){
        List<Produto> produtos = getEstoqueService().listaDeProdutos();
        model.addAttribute("produtos", produtos);
        return "CadastroDeEstoque";
    }

    //ABRE A PÁGINA DE VER OS PRODUTOS
    @GetMapping("/ListaDeEstoques")
    public ModelAndView verEstoques (){
        List<Estoque> estoques = getEstoqueService().list();
        ModelAndView modelAndView = new ModelAndView("ListaDeEstoques");
        modelAndView.addObject("estoques", estoques);
        return modelAndView;
    }
    
    //CADASRTAR ESTOQUES
    // Tu tem que fazer uma logica pra que no Front receba o Id do produto
    @PostMapping("/ListaDeEstoquesCad")
    public ModelAndView cadastrarEstoque ( 
    @RequestParam("produto") long idProduto,
    @RequestParam("quantidade") int quantidade,
    @RequestParam("dataUltimaAtualizacao") LocalDate dataUltimaAtualizacao,
    @RequestParam("localizacao") String localizacao) {
        Estoque estoqueRecebido = new Estoque(quantidade,dataUltimaAtualizacao,localizacao);
        getEstoqueService().create(estoqueRecebido, idProduto);
        ModelAndView modelAndView = new ModelAndView ("redirect:/Estoque/ListaDeEstoques");
        return modelAndView;
    }

    //DELETAR ESTOQUES
    @PostMapping("delete/{id}")
    public ModelAndView apagarEstoque (@PathVariable Long id){
        getEstoqueService().delete(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/Estoque/ListaDeEstoques");
        return modelAndView;
    }

    // EDITAR OS ESTOQUES PARA APAGAR, IRA ABRIR UMA PAGINA NOVA 
    @PostMapping("/editar/{id}")
    public ModelAndView editarEstoque (@PathVariable Long id, Model model) {
        Optional<Estoque> _estoque = getEstoqueService().getEstoqueRepository().findById(id);
        Estoque estoque = _estoque.get();
        ModelAndView modelAndView = new ModelAndView("EditarEstoque");
        modelAndView.addObject("estoqueAntigo", estoque);
        List<Produto> produtos = getEstoqueService().listaDeProdutos();
        model.addAttribute("produtos",produtos);
        return modelAndView;
    }

    //AINDA EDITANDO PEGA OS CAMPOS DO FORM DE EDIÇAO E SALVA EM UM NOVO ESTOQUE E POR FIM ATUALIZA 

    @PostMapping("/atualizar")
    public ModelAndView atualizarEstoque(
        @RequestParam ("id") Long id,
        @RequestParam ("idProduto") long idProduto,
        @RequestParam ("quantidade") int quantidade,
        @RequestParam ("dataUltimaAtualizacao") LocalDate dataUltima,
        @RequestParam ("localizacao") String localizacao) {

        Estoque estoqueRecebido = new Estoque (id, quantidade, dataUltima, localizacao);
        getEstoqueService().update(estoqueRecebido,idProduto);

        ModelAndView modelAndView = new ModelAndView("redirect:/Estoque/ListaDeEstoques");
        return modelAndView;
    }
    
    
    public EstoqueService getEstoqueService() {
        return estoqueService;
    }
}
