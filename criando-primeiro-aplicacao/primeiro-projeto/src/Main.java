public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        int x = 10;
        double y = x; // casting implícito

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3) / 2;
        int classificacao = (int) media / 2 ; // casting explicito

        // text block
        String sinopese = """
                         Filme: Top Gun: Maverick
                         Filme de aventura com galã dos anos 80
                         Ano de lançamento: %d
                         Nota do Filme: %.2f
                         Média: %.2f
                         Classificação: %d
                          """.formatted(anoDeLancamento, notaDoFilme, media, classificacao);

        System.out.println(sinopese);
    }
}