package com.websocket.websockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.websocket.websockets.model.HelloMessage;
import com.websocket.websockets.model.Produto;

@Controller
public class ProdutoController {


  @MessageMapping("/hello")
  @SendTo("/topic/produtos")
  public Produto greeting(HelloMessage message) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Produto ("Produto Exe3mplo", "descricao exenplo", "codigo exempo", 5.6, "real", "10/09/2012", true);
  }

}