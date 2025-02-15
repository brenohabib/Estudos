package atividade2.Aula4;

public class Au4Ex2 {
    public static void main(String[] args) {
        contagemRecursiva(9);
    }
    public static void contagemRecursiva(int numero) {
        if (numero >= 0) {
            contagemRecursiva(0, numero);
        }

    }
    public static void contagemRecursiva(int inicio, int fim) {
        if (inicio <= fim) {
            System.out.println(inicio + " ");
            contagemRecursiva(inicio + 1, fim);
        }
    }
}
