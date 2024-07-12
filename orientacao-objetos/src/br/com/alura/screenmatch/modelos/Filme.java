package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.interfaces.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public Filme() {
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return """
                Filme: %s
                Ano de Lançamento: %d
                Diretor: %s
                Total de avaliações: %d
                Duração em minutos: %d
                Incluído no plano: %b
                """.formatted(this.getNome(), this.getAnoDeLancamento(), this.diretor, this.getTotalDeAvaliacoes(), this.getDuracaoEmMinutos(), this.isIncluidoNoPlano());
    }

    @Override
    public int getClassificacao() {
        return (int) this.pegaMedia() / 2;
    }
}
