package atividade2.Aula12;

class ValidadorDeIdade {
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("A idade deve ser maior ou igual a 18 anos.");
        }
    }
}
