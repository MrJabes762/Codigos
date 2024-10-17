package com.springboot.mr__jabes.service;


import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.mr__jabes.models.dto.FornecedorDTO;


@Service
public class FornecedorService {

    // Criando uma instância do WebClient
    private final WebClient client = WebClient.create("http://localhost:8080");

    public FornecedorDTO getFornecedor(Long id) {
        // Fazendo a requisição para a API informada
        String responseBody = client.get()
                .uri("/api/fornecedores/" + id)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        // Convertendo a string JSON para o objeto FornecedorDTO
        ObjectMapper objectMapper = new ObjectMapper();
        FornecedorDTO fornecedor = null;
        try {
            fornecedor = objectMapper.readValue(responseBody, FornecedorDTO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        
        return fornecedor; // Retornando o objeto FornecedorDTO
    }
    public List<FornecedorDTO> listaDeFornecedoresExemplo (){
        return List.of(
            new FornecedorDTO ((long) 1,"Bahia Produtos"),
            new FornecedorDTO ((long) 2,"Brasil Variedades"),
            new FornecedorDTO ((long) 3,"Produtos Imports"),
            new FornecedorDTO ((long) 4, "Alimentos & Cia"),
            new FornecedorDTO ((long) 5,"Atacadão e Varejos LTDA"),
            new FornecedorDTO ((long) 6,"Produtos e Atacados"),
            new FornecedorDTO ((long) 7,"Olimpicos imports"));
    }
}
