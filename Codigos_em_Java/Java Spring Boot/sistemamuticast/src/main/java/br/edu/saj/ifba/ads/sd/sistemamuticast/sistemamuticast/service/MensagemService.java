package br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.data.MensagemRepository;
import br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.model.Mensagem;
import jakarta.validation.Valid;



@Service
public class MensagemService {

    //Injeção da instancia do Repositório para persistência de mensagens.
    @Autowired
    private MensagemRepository mensagemRepository; 

    // Injeção do Template para envio de mensagens via WebSocket.
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate; 

    // Método que Cria e salva uma nova mensagem, garantindo que não seja duplicada.
    public Mensagem criarMensagem(@Valid String remetente, @Valid String conteudo) {
        Mensagem mensagem = new Mensagem(conteudo, remetente, LocalDateTime.now().toString());
        if (!getMensagemRepository().existsById(mensagem.getId())) {
            getSimpMessagingTemplate().convertAndSend("/topic/mensagem", mensagem); // Envia a mensagem para todos os clientes conectados.
            return getMensagemRepository().save(mensagem); // Salva a mensagem no banco de dados.
        }
        return null;
    }
    // Método que Busca uma mensagem pelo ID.
    public Mensagem buscarMensagemPorId(Long idUsuario) {
        return getMensagemRepository().findById(idUsuario).orElse(null);
    }
    //Método que retorna todas as mensagens armazenadas.
    public List<Mensagem> listarMensagens() {
        return getMensagemRepository().findAll();
    }

    // Métodos de Acesso (Getters)
    public MensagemRepository getMensagemRepository() {
        return mensagemRepository;
    }

    public SimpMessagingTemplate getSimpMessagingTemplate() {
        return simpMessagingTemplate;
    }
}
