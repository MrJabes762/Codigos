
public class Main {
    public static void main(String[] args) {

        //Composicao Dos Perifericos
        Perifericos perifericos = new Perifericos("Perifericos Externos");
        perifericos.adicionar(new Teclado("Dell KB216"));
        perifericos.adicionar(new Mouse("Logitech G203"));
        perifericos.adicionar(new Monitor("Samsung 24'"));

        System.out.println("Perifericos");
        System.out.println(perifericos);

        //Composiçao o gabinete
        PlacaMae placaMae = new PlacaMae("Asus Prime");
        placaMae.adicionar(new Ram("Kingston 8GB"));
        placaMae.adicionar(new Ram("Kingston 8GB"));
        placaMae.adicionar(new Cpu("Intel i7"));

        System.out.println("Placa Mae");
        System.out.println(placaMae);

        //Adicionando a placa mae ao gabinete
        Gabinete gabinete = new Gabinete("Dell G7");
        gabinete.adicionar(new Hd("Seagate 1TB"));
        gabinete.adicionar(placaMae);

        System.out.println("Gabinete");
        System.out.println(gabinete);

        CompositeComputador computador = new CompositeComputador();
        computador.adicionar(gabinete);
        computador.adicionar(perifericos);
        
        System.out.println("Computador");
        System.out.println(computador);
    }
}
