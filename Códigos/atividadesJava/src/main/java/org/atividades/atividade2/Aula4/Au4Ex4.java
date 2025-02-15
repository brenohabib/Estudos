package atividade2.Aula4;

public class Au4Ex4 {
    public static void main(String[] args) {
        int[] vetor = {2,1,6,4,5};
        percorrerVetorInverso(vetor);
    }
    public static void percorrerVetorInverso(int[] vetor) {
        percorrerVetorInverso(vetor, vetor.length - 1);
    }
    public static void percorrerVetorInverso(int[] vetor, int i) {
        if (i >= 0) {
            System.out.println("Índice " + i + " : " + vetor[i]);
            percorrerVetorInverso(vetor, i - 1);
        }
    }
}
