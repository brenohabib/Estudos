package atividade2.Aula3;

public class Au3Ex3 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,6};
        inverterVetor(vetor);
    }
    public static void inverterVetor(int[] vetor){
        int[] aux = new int[vetor.length];
        int cont = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            aux[cont] = vetor[i];
            cont--;
        }
        imprimirVetor(aux);
    }
    public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
