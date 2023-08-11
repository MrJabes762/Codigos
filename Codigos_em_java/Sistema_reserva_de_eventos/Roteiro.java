public class MainReservaEventos {
    public static void main(String[] args) {
        SistemaReservadeEventos sistema = new SistemaReservadeEventos();
        sistema.cadastrarEventos(new Evento ("Esquenta São João", "19/09/2023", "Santo Antônio de Jesus", 15, 17.50));
        sistema.cadastrarEventos(new Evento ("Festival de Inverno", "25/09/2023", "Vitória da Conquista", 15, 17.50));
        System.out.println(sistema.pesquisarEventosdisponiveis ());
        sistema.reservarIngresso (new Ingresso ("Esquenta São João", 2));
        sistema.reservarIngresso (new Ingresso ("Festival de Inverno", 2));
        sistema.gerarComprovante ();
        sistema.getTotaldasreservas (sistema.getComprovante());
    }
}
/*Uma empresa de eventos deseja desenvolver um sistema de reserva de ingressos para seus diversos eventos. 
O sistema deve permitir que os usuários pesquisem eventos disponíveis, selecionem o tipo de ingresso e quantidade desejada, 
e efetuem a reserva. Cada evento possui um nome, data, local, capacidade de público e preço do ingresso.
Modele as classes orientadas a objetos para o sistema de reserva de ingressos. 
Inclua atributos e métodos relevantes para cada classe, bem como relacionamentos apropriados entre elas. 
Utilize os conceitos de encapsulamento, agregação e composição onde necessário.
Escreva também o código de uma classe principal chamada MainReservaEventos() 
para demonstrar a reserva de ingressos para dois eventos diferentes, selecionando tipos e quantidades de ingressos,
 e calculando o valor total das reservas.
 */