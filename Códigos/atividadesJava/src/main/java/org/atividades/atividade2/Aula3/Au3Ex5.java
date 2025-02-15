package atividade2.Aula3;

public class Au3Ex5 {
    public static void main(String[] args) {
        String[] vetor = {"casa", "carro", "televisão", "estante", "bola"};
        mostrarImpares(vetor);

    }
    public static void mostrarImpares(String[] vetor) {
        int paddle = 0;
        if (vetor.length % 2 != 0) {
            paddle++;
        }
        String[] vetorImpar = new String[vetor.length / 2 + paddle];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(i % 2 == 0) {
                vetorImpar[cont] = vetor[i];
                cont++;
            }
        }
        imprimirVetor(vetorImpar);
    }
    public static void imprimirVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
