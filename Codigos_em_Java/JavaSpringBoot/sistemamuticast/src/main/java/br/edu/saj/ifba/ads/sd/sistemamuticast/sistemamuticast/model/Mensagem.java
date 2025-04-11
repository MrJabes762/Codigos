package br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "mensagem")
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único da mensagem, gerado automaticamente para evitar duplicidade de mensagens.

    @NotBlank(message = "O conteudo não pode ser vazio")
    private String conteudo; // Conteúdo textual da mensagem.

    @NotBlank(message = "O remetente não pode ser vazio")
    private String remetente; // Nome do remetente da mensagem.
    
    @NotNull(message = "O timeStamp não pode ser vazio")
    private String timeStamp; // Data e hora em que a mensagem foi criada.

    // Construtor padrão.
    public Mensagem() {
      
    }
    // Construtor que inicializa os atributos da mensagem.
    public Mensagem(String conteudo, String remetente, String timeStamp) {
        setConteudo(conteudo);
        setRemetente(remetente);
        setTimeStamp(timeStamp);
    }

    // Métodos de acesso
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
