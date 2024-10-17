package com.springboot.mr__jabes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String menu(){
        return "MenuPrincipal";
    }

    @GetMapping("/CadastroDeProdutosMenu")
    public String cadProdutosMenu(){
        return "MenuCadastrodeProdutos";
    }

    @GetMapping("/CadastroDeEstoqueMenu")
    public String cadEstoqueMenu(){
        return "MenuCadastrodeEstoque";
    }

    @GetMapping("/CadastroDeCategoriaMenu")
    public String cadCategoriaMenu(){
        return "MenuCadastrodeCategoria";
    }
    
}
