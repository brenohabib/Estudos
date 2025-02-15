package atividade2.Aula1;

import java.util.Scanner;

public class Au1Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        System.out.println("Fatorial = " + fatorial(input.nextInt()));
        input.close();
    }

    public static int fatorial(int valor) {
        int fatorial = valor;
        for (int i = 0; i <= valor; i++) {
            valor--;
            fatorial *= valor;
        }
        return fatorial;
    }

}
