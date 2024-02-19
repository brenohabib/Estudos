package atividade2.Aula4;

public class Au4Ex3 {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 2, 6, 3};
        percorrerVetor(vetor);

    }
    public static void percorrerVetor(int[] vetor) {
        percorrerVetor(vetor, 0);
    }
    public static void percorrerVetor(int[] vetor, int i) {
        if (i < vetor.length) {
            System.out.println("Índice " + i + " : " + vetor[i]);
            percorrerVetor(vetor, i + 1);
        }
    }
}
