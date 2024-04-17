package atividade2.Aula12;

public class MainValidador {
    public static void main(String[] args) {
        int idade = 15;
        
        try {
            ValidadorDeIdade.verificarIdade(idade);
            System.out.println("Idade válida: " + idade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
