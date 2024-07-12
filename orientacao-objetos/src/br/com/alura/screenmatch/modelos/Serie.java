package br.com.alura.screenmatch.modelos;

import java.util.Collections;
import java.util.List;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    private List<Episodio> episodios;

    public Serie(String nome, int anoDeLancamento, List<Episodio> episodios) {
        super(nome, anoDeLancamento);
        this.episodios = episodios;
    }

    public Serie() {

    }

    public List<Episodio> getDados() {
        return Collections.unmodifiableList(this.episodios);
    }

    // polimorfismo
    @Override
    public int getDuracaoEmMinutos() {
        return this.temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return """
                Filme: %s
                Ano de Lançamento: %d
                Temporadas: %d
                Total de avaliações: %d
                Duração em minutos: %d
                Incluído no plano: %b
                """.formatted(this.getNome(), this.getAnoDeLancamento(), this.temporadas, this.getTotalDeAvaliacoes(), this.getDuracaoEmMinutos(), this.isIncluidoNoPlano());
    }
}
