package algoritmosdeEleicaoBully.service;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

//Classe de Representação do Sitema de Algoritmo de Eleição
public class SistemaDeAlgoritmoDeEleicao {

    //Atributos 
    private int contadorDeEventos;// Variavel de controle de eventos 
    private List<No> listaDeNos;// Lista de nós associados ao sistema
    // Evocando o Random do Java para valores inteiros e aleatorios 
    // que farão parte da matipulação do identificador 
    private Random rand;
    //Detrne a de nós recuperaremos a posição do Coordenador
    private int posicaoCordenador;

    //Construtor 
    public SistemaDeAlgoritmoDeEleicao() {
        setContadorDeEventos(0);
        setListaDeNos(new ArrayList<>());
        setRand(new Random());
    }

    //Metodo que recebe o no criado e adicona a lista de nós retornando uma string informativa
    public String adicionarNo(No no) {
        getListaDeNos().add(no);
        No.idCont++;
        return "Nó Criado e Adiconado a lista: " + getListaDeNos().get(no.getIdLocal()).toString();
    }

    //Metodo de Setar o Coordenador
    public String setCoordenador() {
        if (getListaDeNos().isEmpty()) {// veridicação inicial de lista vazia 
            return "Lista de nós está vazia. Não é possível definir um coordenador.";
        }

        int maiorIdentificador = 0;//atributo de controle do maior iden...
        int novaPosicaoCoordenador = -1;//variavel de controle da posicoa do novo Cod

        for (int i = 0; i < getListaDeNos().size(); i++) {//Laço de repeticao para inferir o maior id
            if (getListaDeNos().get(i).getIdentificador() > maiorIdentificador) {
                maiorIdentificador = getListaDeNos().get(i).getIdentificador();// atribuição 
                novaPosicaoCoordenador = i;//armazenamento da posição
            }
        }

        // Se permanecer com o valor, inicial não foi encontrado
        if (novaPosicaoCoordenador == -1) {
            return "Não foi possível encontrar um novo coordenador.";
        }

        //Garantia de desatribuiçã do coordenador
        if (getPosicaoCordenador() >= 0 && getPosicaoCordenador() < getListaDeNos().size()) {
            getListaDeNos().get(getPosicaoCordenador()).setIsCoordenador(false);
        }
        // seta a posição do novo coordenador 
        setPosicaoCordenador(novaPosicaoCoordenador);
        //setando o novo coordenador
        getCoordenador().setIsCoordenador(true);
        //String de retorno 
        return "No coordenador escolhido com base no Identificador: " 
                    + getCoordenador().getNome()// exibe o nome do cood
                    + notificacao();// Notifica os nos vizinhos
    }
    //Metodo de simulaçao da ocorrencia de eventos 
    public String eventoOcorre() throws EventoLimiteExecption {
        if (getContadorDeEventos() >= 3) {// o contador vai ate 3 eventos e lança a excessão 
            throw new EventoLimiteExecption("Passamos do Limite de eventos para a eleição de um novo coordenador");
        } else {// se nao 
            //o contador é imcrementado
            setContadorDeEventos(contadorDeEventos + 1);
            //E o identificador e alterado conforme a execução do evento 
            //para aleatorizar os valores durante a execução 
            getListaDeNos().forEach(no -> no.setIdentificador(no.getIdentificador() * getRand().nextInt(10)));//Simulando a aleatoriedade do maior identificador
            return "Ocoreu o " + getContadorDeEventos() + "º evento.";
        }
    }

    // Metodo de carregamento de lista de nos vizinhos
    private void carregarListaNoVizinhos() {
        getCoordenador().getNosVizinhos().clear();// limpando a lista 
        getListaDeNos().forEach(no -> no.setNotificacao(" "));// limpando as notificacoes
        for (No no : getListaDeNos()) {
    // Na lista de vizinhos daquele que é igual será verificado se contem o no viznho ele não é igual ao coordenador 
            if (!getCoordenador().getNosVizinhos().contains(no) && !Objects.equals(getCoordenador(), no)) {
               getCoordenador().getNosVizinhos().add(no);//ai é adicionado
            }
        }
    }

    // Metodo de notificação dos viznhos
    private String notificacao() {
        carregarListaNoVizinhos();//Primeiro carrega a lista 
        getCoordenador()// PAra cada visnho apenas uma notificação simbolica 
            .getNosVizinhos()
            .forEach(noVizinho -> noVizinho.setNotificacao("Atenção o No: " + getCoordenador().getNome() + " é o novo coordenador"));
        //retorno de uma string para o setCordenador
        return " e seus vizinhos  " + getCoordenador().getNosVizinhos().stream().map((v) -> v.getNome()).toList() + " Foram notificados";
    }
    //Metodo de simulação de um coordenador saindo do ar 
    public No coordenadorSaiuDoAr () {
        return getListaDeNos().remove(getCoordenador().getIdLocal());
    }

    // Pega o coordenador com base na posicao setada e pega na lista 
    private No getCoordenador(){
        return getListaDeNos().get(getPosicaoCordenador());
    }

    //Metodos de Acesso
    public int getContadorDeEventos() {
        return this.contadorDeEventos;
    }

    public void setContadorDeEventos(int contadorDeEventos) {
        this.contadorDeEventos = contadorDeEventos;
    }

    public List<No> getListaDeNos() {
        return this.listaDeNos;
    }

    public void setListaDeNos(List<No> listaDeNos) {
        this.listaDeNos = listaDeNos;
    }

    public Random getRand() {
        return this.rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getPosicaoCordenador() {
        return posicaoCordenador;
    }

    public void setPosicaoCordenador(int posicaoCordenador) {
        this.posicaoCordenador = posicaoCordenador;
    }

}
