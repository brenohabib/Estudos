package atividade2.Aula13;

public class Principal {
    public static void main(String[] args) {
        try {
            Pessoa p1 = null;
            int idade = 0;
                idade = 2023 - p1.getAnoNascimento();
                System.out.println("Nome: " + p1.getNome());
                System.out.println("Idade: " + idade);

        } catch (NullPointerException e) {
            System.out.println("Pessoa foi inicializada como null");
        }
    }
}