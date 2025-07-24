package atividade3.Aula2ex1;

public class TestarFilme {
    public static void main(String[] args) {
        Filme umFilmeQualquer = new Filme("Os Vingadores", 142);
        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("O Cão e a Raposa", 100);
        meuFilmeFavorito.setDuracaoEmMinutos(83);

        meuFilmeFavorito.exibirDuracaoEmHoras();

        System.out.printf("Os filmes no catálogo são %s e %s", umFilmeQualquer.getTitulo(), meuFilmeFavorito.getTitulo());
    }
}
