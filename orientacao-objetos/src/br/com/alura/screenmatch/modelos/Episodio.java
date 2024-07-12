package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.interfaces.Classificavel;

public class Episodio implements Classificavel {
    private String nome;
    private int numero;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
        if (this.totalVisualizacoes > 100) {
            return 4;
        }
        return 2;
    }
}
