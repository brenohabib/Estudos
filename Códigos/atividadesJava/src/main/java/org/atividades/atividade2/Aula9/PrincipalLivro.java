package atividade2.Aula9;

public class PrincipalLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Post Fable", "Trigaroo", 2022, 300);
        Livro livro2 = new Livro("Disma Lair", "Trigaroo", 2021, 150);

        System.out.println("Informações sobre o livro 1:");
        livro1.exibirDadosPessoa();

        System.out.println("\nInformações sobre o livro 2:");
        livro2.exibirDadosPessoa();
    }
}
