package Exercicios.exercicio_emprestimo_livro_2.Data;

import java.util.ArrayList;

import Exercicios.exercicio_emprestimo_livro_2.Models.Livro2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Excepitions.Livroexception;

public class Estante2 {
    private ArrayList<Livro2> estantedelivros;

    public Estante2() {
        setEstantedelivros();
    }

    public void setEstantedelivros() {//feito
        this.estantedelivros = new ArrayList<>();
    }

    public ArrayList<Livro2> getEstantedelivros() {//feto
        return estantedelivros;
    }

    public void adicionarLivronaestante(Livro2 livro) throws Livroexception {//feito criar try catch no metodo que chamar
        if (livro != null) {
            getEstantedelivros().add(livro);
        } else {
            throw new Livroexception("Livro Incorreto");
        }
    }

    private Livro2 buscarLivroEstante(String codigodolivro) {// feito 
        for (int i = 0; i < estantedelivros.size(); i++) {
            if (getEstantedelivros().get(i).getCodigo().equals(codigodolivro)) {
                return getEstantedelivros().get(i);
            }
        }
        return null;
    }

    public Livro2 pegarLivro2daestante(String codigodolivro) throws Livroexception {//feito criar try catch no metodo que chamar
        Livro2 pegueiLivrodaEstante = buscarLivroEstante(codigodolivro);
        if (pegueiLivrodaEstante != null) {
            for (int i = 0; i < estantedelivros.size(); i++) {
                if (getEstantedelivros().get(i).equals(pegueiLivrodaEstante)) {
                    getEstantedelivros().remove(i);
                }
            }
            return pegueiLivrodaEstante;
        } else {
            throw new Livroexception("Livro incorreto ou não encontrado");
        }
    }

}