package br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.controllers;

import br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.model.Mensagem;
import br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.service.MensagemService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




// Camada De Controller responsavel por gerir todas as requisições HTTP
@RestController// Controlador do tipo REST
@RequestMapping("/api/mensagem")
public class MensagemController {

    // Injeção do Serviço responsável pela lógica de negócios.
    @Autowired
    private MensagemService mensagemService;

    // Método que realiza o Envio uma nova mensagem
    @PostMapping("/enviar")
    public void enviarMensagem(@RequestParam String remetente, @RequestBody String conteudo) {
        getMensagemService().criarMensagem(remetente, conteudo);
    }

    // Método que Retorna a lista de todas as mensagens armazenadas.
    @GetMapping
    public List<Mensagem> listaDeMensagens() {
        return getMensagemService().listarMensagens();
    }

    // Método que Processa mensagens recebidas via WebSocket e as distribui para todos os clientes conectados.
    @MessageMapping("/chat")
    @SendTo("/topic/mensagem")
    public Mensagem processarMensagem(Mensagem mensagem) {
        return getMensagemService().criarMensagem(mensagem.getConteudo(), mensagem.getRemetente());
    }

    // Metodos de acesso
    public MensagemService getMensagemService() {
        return mensagemService;
    }
}
