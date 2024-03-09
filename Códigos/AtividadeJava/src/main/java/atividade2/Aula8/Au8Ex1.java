package atividade2.Aula8;

public class Au8Ex1 {
    public static int X(int a) {
        if (a <= 0 )
            return 0;

        return a + X(a-1);
    }

    public static void main(String[] args) {
        int result = X(8);
        int resultY = Y(8);

        System.out.println(result);
        System.out.println(resultY);
    }


/*
a) O que esta função faz?

Essa função pega a soma de todos os números de 0 até N; x = 0 + 1 + 2 + 3 + ... + N

b) Escreva uma função não-recursiva que resolve o mesmo problema.
*/ 
    public static int Y(int b) {
        int cont = 0;
        for (int i = 0; i <= b; i++) {
            cont += i;
        }
        return cont;
    }
}