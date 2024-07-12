import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme coraline = new Filme("Coraline", 2014);
        coraline.avalia(10);
        Filme genteGrande = new Filme("Gente Grande", 2012);
        genteGrande.avalia(9);
        Filme divertidamente2 = new Filme("Divertidamente 2", 2024);
        divertidamente2.avalia(9);
        Serie serie1 = new Serie("How i meet your mother", 2005, null);
        serie1.avalia(8);

        List<Titulo> lista = new ArrayList<>();

        lista.add(coraline);
        lista.add(genteGrande);
        lista.add(divertidamente2);
        lista.add(serie1);

        PrincipalComListas.imprimeLista(lista);
        Collections.sort(lista);
        PrincipalComListas.imprimeLista(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        PrincipalComListas.imprimeLista(lista);
    }

    public static void imprimeLista(List<Titulo> lista) {
        if (lista != null) {
            for (Titulo item : lista) {
                System.out.println(item.toString());
                /*
                if (item instanceof Filme) {
                    Filme filme = (Filme) item;
                    System.out.println("Classificação" + filme.getClassificacao());
                }*/
                /*
                // java 14 é possível fazer a declaracao da variável e a utilização na mesma linha, nao precisando do cast
                if (item instanceof Filme filme) {
                    System.out.println("Classificação" + filme.getClassificacao());
                }*/
                // java 17 é possível utilizar a mesma linha para complementar validações
                if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                    System.out.println("Classificação " + filme.getClassificacao());
                }
            }
        }
    }
}
