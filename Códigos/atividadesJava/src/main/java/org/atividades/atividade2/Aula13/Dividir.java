package atividade2.Aula13;

import java.util.Scanner;

public class Dividir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 2;
        int resultado;

        System.out.println("Digite um valor para ser dividido por 2: ");
        int dividendo = input.nextInt();

        try {
            resultado = valor / dividendo;
            System.out.println("Resultado: " + resultado);
        } 
        catch (ArithmeticException e) {
            if(dividendo == 0) {
            System.out.println("Impossível dividir por zero");
            } else {
                System.out.println("Erro no cálculo");
            }
        }
        input.close();
    }
}
