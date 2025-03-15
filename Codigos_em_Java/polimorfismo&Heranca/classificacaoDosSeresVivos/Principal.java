public class Principal {
    public static void main(String[] args) {
        // Criação de objetos individuais (Folhas no padrão Composite)
        SerVivo animalia = new Animalia();
        SerVivo chordata = new Chordata();
        SerVivo mammalia = new Mammalia();
        SerVivo primata = new Primata();
        SerVivo hominidae = new Hominidae();
        SerVivo homo = new Homo();
        SerVivo homoSapiens = new HomoSapiens();

        // Criação do objeto composto (Componente Composto no padrão Composite)
        ClassificacaoSerVivo classificacaoHomoSapiens = new ClassificacaoSerVivo();
        
        // Adição de objetos individuais ao composto
        classificacaoHomoSapiens.adicionarClassificacao(animalia);
        classificacaoHomoSapiens.adicionarClassificacao(chordata);
        classificacaoHomoSapiens.adicionarClassificacao(mammalia);
        classificacaoHomoSapiens.adicionarClassificacao(primata);
        classificacaoHomoSapiens.adicionarClassificacao(hominidae);
        classificacaoHomoSapiens.adicionarClassificacao(homo);
        classificacaoHomoSapiens.adicionarClassificacao(homoSapiens);

        // Operação uniforme sobre o composto
        classificacaoHomoSapiens.mostrar();
    }
}