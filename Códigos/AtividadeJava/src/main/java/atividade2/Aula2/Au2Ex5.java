package atividade2.Aula2;

public class Au2Ex5 {
    public static void main(String[] args) {
        int[] vetor = {6,12,5,1,2,6};
        imprimirVetor(vetor);
    }
    public static void imprimirVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
