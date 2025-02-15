package atividade2.Aula5;

import java.util.Scanner;

public class Au5Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(potenciaRecursiva(input.nextInt(), input.nextInt()));

        input.close();
    }
    public static int potenciaRecursiva(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potenciaRecursiva(base, expoente - 1);

    }
}

