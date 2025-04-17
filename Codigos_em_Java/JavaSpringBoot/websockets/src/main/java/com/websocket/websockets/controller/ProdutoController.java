package com.websocket.websockets.controller;

import com.websocket.websockets.model.HelloMessage;
import com.websocket.websockets.model.Produto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@Controller
public class ProdutoController {

  @MessageMapping("/hello")
  @SendTo("/topic/produtos")
  public Produto greeting(HelloMessage message) throws Exception {
    Thread.sleep(1000); // simulating delay
    return new Produto("Produto Exemplo", "descricao exemplo", "codigo exemplo", 5.6, "real", "10/09/2012", true);
  }

}