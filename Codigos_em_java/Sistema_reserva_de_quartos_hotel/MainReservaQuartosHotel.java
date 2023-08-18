public class MainReservaQuartosHotel {

    public static void main(String[] args) {
        SistemaReservadeQuartosHotel sistema = new SistemaReservadeQuartosHotel ();
        sistema.cadastroDeQuartosNoHotel (new Quarto (1,"Solteiro", 30.00, 3));
        sistema.cadastroDeQuartosNoHotel (new Quarto (2,"Casal", 40.00, 4));
        sistema.cadastroDeQuartosNoHotel (new Quarto (3,"Suite", 50.00, 3));
        sistema.reservarQuartos ();
    }
    /*Uma rede de hotéis está planejando um sistema de reserva de quartos online. 
    O sistema deve permitir que os clientes pesquisem quartos disponíveis, escolham as datas de check-in e check-out, e façam a reserva. 
    Cada quarto de hotel possui um número, tipo (solteiro, casal, suíte), preço por noite e capacidade de hóspedes.
    Modele as classes orientadas a objetos para o sistema de reserva de quartos de hotel, 
    detalhando os atributos e métodos relevantes para cada classe, além dos relacionamentos entre elas.
    Aplique os conceitos de encapsulamento, agregação e composição conforme apropriado.
    Inclua também o código de uma classe principal chamada MainReservaQuartosHotel() para exemplificar a reserva de dois quartos de 
    tipos diferentes, selecionando as datas e calculando o valor total das reservas.
    */
}
