package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true) = vai ignorar e evitar converter todas propriedades nao mapeadas
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Poster") String poster,
                         @JsonAlias("Plot") String sinopse) {
    //@JsonAlias() = Serve somente para ler o json
    //@JsonProperty() = Serve no processo de serialização ou desserialização

}
