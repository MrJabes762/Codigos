# Sistema Distribuído de Sensores Climáticos - Quarkus

O projeto implementa um **Sistema Distribuído Baseado em Sensores Climáticos**, desenvolvido com o framework **Quarkus** - devido a sua aplicabilidade em sistemas de alta performace, sendo uma escolha adequada quando se trata Arquiteturas Distribuidas e Microsserviços desta natureza. 

No projeto, em sintese, cada instância representa um sensor climático que se comunica de forma distribuída via **Sockets, Multicast, gRPC e REST**, suportando eleição de coordenador, heartbeat, snapshots e criptografia.

---

## Tecnologias

- Java 21** + Quarkus
- gRPC e REST
- UDP Multicast / TCP Socket
- Docker e Docker Compose
- Padões de projeto: Singleton, Proxy, Front-Controller (Com o Façade implicito)
- Criptografia HMAC com SHA256
- Clock de Lamport
- Bully
- Heartbeat
- Snapshots com JSON persistente
- Parões Arquiteturais: Service - layer, Repository Parttern, Domain - Driven Design e Layered Architeture, Microsserviços Distribuidos (Simulação), Monolitico Modularizado (Implicito).

---

## Arquitetura

Cada sensor roda em um contêiner Docker e se comunica com os demais sensores distribuídos. O sistema utiliza:

- Comunicação Rest para gerencia dos Sensores.
- Comunicação via gRPC para registrar e listar sensores.
- Comunicação via Multicast e Sockets TCP/UDP para sincronização entre sensores.
- Algoritmo Bully para eleição de coordenador.
- Heartbeat para monitorar a saude do líder.
- Snapshot automático com persistência local para recuperação do estado.
- Assinatura digital via HMAC para segurança dos dados.

---

## Estrutura do Projeto

| Diretório       | Descrição                                                                                     |
|------------------|-----------------------------------------------------------------------------------------------|
| `/model`         | Entidades como `Sensor`, `MensagemMulticast`, `SnapshotEstado`, `LeituraClimatica`.          |
| `/service/time`          | Serviço de Clocks e sincronização lógica.                                                              |
| `/service`       | Serviços como `LeituraClimaticaService`, `ReplicaçãoService`, `SnapShotService`, `SensorService` (Com a aplicação do Singleton Manual).|
| `/socket`        | Comunicação TCP/UDP.                                                                        |
| `/multicast`     | Comunicação em grupo.                                                                       |
| `/service/grpc`          | Serviço de Handlers gRPC.                                                                              |
| `/controller`    | REST controllers - Nesse caso, apenas a gerência do sensor via Front-Controller REST.       |
| `/service/coordenador`   | Serviço de Eleição de líder e Heartbeat.                                                               |
| `/security`      | HMAC - (criptografia SHA256) e validações de integridade.                                   |
| `/docker`        | Arquivos `Dockerfile` e `docker-compose`.                                                   |
| `/repository`    | Armazenamento em memória (persistência em banco de dados, se necessário, em futuras versões).|
| `/proxy`         | Implementação (de uma variação) do Padrão Proxy de Proteção (do GOF) para validação dos sensores.       |

---

## Como Rodar Localmente (Modo Dev)

```bash
./mvnw quarkus:dev
```

Acesse a Dev UI em: [http://localhost:8080/q/dev](http://localhost:8080/q/dev)

---

## Como Rodar com Docker

```bash
docker-compose up --build
```

Isso irá criar múltiplos sensores (sensor01, sensor02...) com variáveis de ambiente distintas.

---

## Como Interagir

- **gRPC** (usando `grpcurl`):
```bash
grpcurl -plaintext localhost:8081 sensor.SensorService/ListarSensores
```

- **REST (se disponível):**
```bash
GET  http://localhost:8081/sensores
POST http://localhost:8081/sensores
```

---

## Testes e Simulações

- Use o método `SensorService.gerarLeituraClimatica()` para simular alterações.
- Use `HeartbeatService.monitorar()` para forçar a verificação do coordenador.
- Snapshots são salvos automaticamente e assinados digitalmente.

---

## Build e Empacotamento

Para compilar e rodar o projeto, utilize os comandos abaixo:

### Build Padrão
```bash
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

### Über-Jar
```bash
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

### Build Nativo (requer GraalVM ou container)
```bash
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

---

## Créditos

Desenvolvido por: **Jabes Cajazeira**

Este projeto explora conceitos fundamentais e avançados de Sistemas Distribuídos incluindo:

- Resiliência e Comunicação entre sensores
- Design Orientado a Objetos
- Padrões de Projeto ao Negócio como por exemplo:  Singleton, Proxy, Front-Controller (Com o Façade).
- Padrões Arquiteturais como: Service - layer, Repository Partern, Domain - Driven Design e Layered Architeture, Microsserviços Distribuidos (Simulação), Monolitico Modularizado.
- Sincronização de Relógios e Snapshots Automáticos
- Segurança de dados com HMAC e SHA256

---