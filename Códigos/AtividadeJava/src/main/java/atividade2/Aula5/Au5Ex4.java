package atividade2.Aula5;

import java.util.Scanner;

public class Au5Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(fibonacciRecursiva(input.nextInt() + 1));

        input.close();
    }
    public static int fibonacciRecursiva(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return n;
        }
        return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);

    }
}
