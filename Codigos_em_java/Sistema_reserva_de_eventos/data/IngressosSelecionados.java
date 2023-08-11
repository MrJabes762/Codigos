public class IngressosSelecionados {
    private static List <Ingresso> listaDeIngressosSelecionados;
    public IngressosSelecionados (){
        setListaDeIngressosSelecionados();
    }
    public List<Ingresso> getListaDeIngressosSelecionados() {
        return listaDeIngressosSelecionados;
    }
    public void setListaDeIngressosSelecionados() {
        IngressosSelecionados.listaDeIngressosSelecionados = new List ();
    }
    private Evento pesquisarEventonoBancodeDados (Ingresso ingresso){
        for (int i = 0; i < getBancoDeEventos().size(); i++)
        if (getBancoDeEventos().get(i).getNome().equals (ingresso.getNomeDoEvento())){
            return getBancoDeEventos().get(i);
        }
        return null;
    }
    public boolean adicinarIngressoSelecionado (Ingresso ingresso){
        if (pesquisarEventonoBancodeDados(ingresso) == null){
            return false;
        }else {
            if (ingresso.getQuantidadeDeIngressos() <= pesquisarEventonoBancodeDados(ingresso).getQuantidade()){
                pesquisarEventonoBancodeDados(ingresso).getQuantidade() -= ingresso.getQuantidadeDeIngressos();
                getListaDeIngressosSelecionados().add(pesquisarEventonoBancodeDados(ingresso));
                return true;
            }
        }
    }
}
