package br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.data;
import br.edu.saj.ifba.ads.sd.sistemamuticast.sistemamuticast.model.Mensagem;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


// Interface que fornece métodos para operações de persistência no banco de dados.
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
    Optional<Mensagem> findById(Long id); // Busca uma mensagem pelo seu ID.
}
