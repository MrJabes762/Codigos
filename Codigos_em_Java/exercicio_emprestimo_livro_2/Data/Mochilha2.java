package Exercicios.exercicio_emprestimo_livro_2.Data;

import java.util.ArrayList;

import Exercicios.exercicio_emprestimo_livro_2.Models.Livro2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Excepitions.Livroexception;

public class Mochilha2 {
        private ArrayList<Livro2> mochila;

    public Mochilha2() {
        setmochilaAluno();
    }

    private void setmochilaAluno() {//feito
        this.mochila = new ArrayList<>();
    }

    private ArrayList<Livro2> getMochila() {//feto
        return this.mochila;
    }

    public boolean adicionarNaMochila(Livro2 livro) throws Livroexception {//feito criar try catch no metodo que chamar
        if (livro != null) {
            getMochila().add(livro);
            return true;
        } else {
            throw new Livroexception("Livro Incorreto");
        }
    }

    private Livro2 buscarLivronaMochila (String codigodolivro) {// feito 
        for (int i = 0; i < mochila.size(); i++) {
            if (getMochila().get(i).getCodigo().equals(codigodolivro)) {
                return getMochila().get(i);
            }
        }
        return null;
    }

    public Livro2 pegarLivronaMochila(String codigodolivro) throws Livroexception {//feito criar try catch no metodo que chamar
        Livro2 pegueiLivronaMochila = buscarLivronaMochila(codigodolivro);
        if (pegueiLivronaMochila != null) {
            for (int i = 0; i < mochila.size(); i++) {
                if (getMochila().get(i).equals(pegueiLivronaMochila)) {
                    getMochila().remove(i);
                }
            }
            return pegueiLivronaMochila;
        } else {
            throw new Livroexception("Livro incorreto ou não encontrado");
        }
    }

}
