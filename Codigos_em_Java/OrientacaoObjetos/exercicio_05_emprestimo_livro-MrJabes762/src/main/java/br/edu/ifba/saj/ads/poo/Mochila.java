package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class Mochila {
    private ArrayList<Livro> mochila;
    private Livro livro;
    private final int limitealumo = 2;
    private final int limiteprofessor = 5;

    public Mochila() {
        mochila = new ArrayList<>();
    }
    
    public int getLimitealumo() {
        return this.limitealumo;
    }

    public int getLimiteprofessor() {
        return this.limiteprofessor;
    }

    public boolean adicionarLivro(Livro livro, int qual) {
        if (mochila.size() < getLimitealumo() && (qual == 1)) {
            mochila.add(livro);
            return true;
        }else if ((mochila.size() < getLimiteprofessor()) && (qual == 2)) {
            mochila.add(livro);
            return true;
        }
        return false;
    }

    public boolean isMochilanaocheia(int qual) {
        if ((qual == 1) && (mochila.size() < getLimitealumo())) {
            return true;
        } else if ((qual == 2) && (mochila.size() < getLimiteprofessor())) {
            return true;
        }
        return false;
    }
    
    public Livro getLivroMochila(String codigoLivro1) {// Pesquisa na estante o livro através do seu código
        Livro pesquLivro = null;
        for (int i = 0; i < mochila.size(); i++) {
            if ((codigoLivro1).equals(livro.getCodigo())) {
                pesquLivro = mochila.get(i);
                break;
            }
        }
        return pesquLivro;
    }

    public boolean tiraLivrodaMochila(Livro livrodapesquisa) {
        for (int i = 0; i < mochila.size(); i++) {
            if ((this.livro).equals(livro)) {
                mochila.remove(i);
                return true;
            }
        }
        return false;
    }
}
