package atividade2.Aula12;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numerador: ");
        int numerador = input.nextInt();
        System.out.print("Digite o denomidador: ");
        int denominador = input.nextInt();
        try {
            double resultado = Calculadora.dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        input.close();
    }
}
