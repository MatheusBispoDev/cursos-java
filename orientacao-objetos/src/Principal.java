import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme coraline = new Filme();

        coraline.setNome("Coraline");
        coraline.setAnoDeLancamento(2022);
        coraline.setDuracaoEmMinutos(120);
        coraline.setIncluidoNoPlano(true);

        coraline.avalia(8);
        coraline.avalia(10);
        coraline.avalia(7);

        Filme genteGrande = new Filme("Gente Grande", 2022);

        genteGrande.setDuracaoEmMinutos(120);
        genteGrande.setIncluidoNoPlano(true);

        genteGrande.avalia(8);
        genteGrande.avalia(10);
        genteGrande.avalia(7);

        System.out.println(coraline.toString());
        System.out.println(coraline.getSomaDasAvaliacoes());
        System.out.println(coraline.pegaMedia());

        Episodio episodio2 = new Episodio();
        episodio2.setNome("Piloto");
        List<Episodio> episodios = new ArrayList<>();
        episodios.add(episodio2);
        episodios.add(episodio2);

        Serie serie1 = new Serie("How i meet your mother", 2022, episodios);

        serie1.setNome("How i meet your mother");
        serie1.setAnoDeLancamento(2022);
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(20);
        serie1.setMinutosPorEpisodio(50);
        System.out.println(serie1.toString());
        System.out.println(serie1.getDuracaoEmMinutos());

        System.out.println(serie1.getDados().size());
        serie1.getDados().add(episodio2);
        System.out.println(serie1.getDados().size());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        calculadoraDeTempo.IncluiFilme(coraline);
        System.out.println(calculadoraDeTempo.getTempoTotal());
        calculadoraDeTempo.IncluiFilme(serie1);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(coraline);
        Episodio episodio1 = new Episodio();
        episodio1.setNome("Piloto");
        filtro.filtra(episodio1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(coraline);
        listaDeFilmes.add(genteGrande);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(0).getNome());

    }


}