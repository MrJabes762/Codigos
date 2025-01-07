public class MainReservaQuartosHotel {

    public static void main(String[] args) {
        SistemaReservadeQuartosHotel sistema = new SistemaReservadeQuartosHotel();
        try {
            sistema.cadastroDeQuartosNoHotel(new Quarto(1, "Solteiro", 30.00, 3));
            sistema.cadastroDeQuartosNoHotel(new Quarto(2, "Casal", 40.00, 4));
            sistema.cadastroDeQuartosNoHotel(new Quarto(3, "Suite", 50.00, 3));
            sistema.reservarQuartos(1);
            sistema.reservarQuartos(2);
            System.out.println(sistema.getTotaldasReservas());
            sistema.gerarComprovante();
            System.out.println(sistema.getComprovante());
        } catch (ArgumentoInrregularException e) {
            System.out.println(e.getMessage());
        }
    }
}
