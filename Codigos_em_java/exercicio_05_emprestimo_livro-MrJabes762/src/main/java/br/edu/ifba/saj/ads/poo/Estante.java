package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
public class Estante {
    private Livro livro;
    private ArrayList<Livro> estantedeLivros;
    private int quantidadeLivroEstante;
    public Estante() {
        estantedeLivros = new ArrayList<>();
        this.quantidadeLivroEstante = 10;
    }

    public Livro getLivroEstante(String codigoLivro1) {// Pesquisa na estante o livro através do seu código
        Livro pesquLivro = null;
        for (int i = 0; i < estantedeLivros.size(); i++) {
            if ((codigoLivro1).equals(livro.getCodigo())) {
                pesquLivro = estantedeLivros.get(i);
                break;
            }
        }
        return pesquLivro;
    }

    public boolean AddLivroEstante(Livro livro) {// Adiciona livro normalmente com limite de 10 posições pq uma estante possui tamanh no mundo real
        if (estantedeLivros.size() < getQuantidadeLivroEstante()) {
            estantedeLivros.add(livro);
            return true;
        }
        return false;
    }

    public boolean tiraLivrodaEstante (Livro livro) {// Pesquisa e remove o livro através do objeto
        for (int i = 0; i < estantedeLivros.size(); i++) {
            if ((this.livro).equals(livro)) {
                estantedeLivros.remove(i);
                return true;
            }
        }
        return false;
    }
    public int getQuantidadeLivroEstante() {// Quantidade de Livros na estante
        return this.quantidadeLivroEstante;
    }
}
