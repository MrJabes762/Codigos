
public class Main {
    public static void main(String[] args) {
        ListaMapDeObjetos lista = new ListaMapDeObjetos();
        lista.adicionarItensNaLista("Chave1", 1);
        lista.adicionarItensNaLista("Livro2", 2);
        System.out.println(lista.ListadeObjetos());
    }
}
