package atividade2.Aula6;

public class Au6Ex2 {
    public static void main(String[] args) {
        int[] vetor = {4,1,2,3,6,1,2};
        System.out.println(maiorValor(vetor));
    }   
    public static int maiorValor(int[] vetor) {
        if(vetor.length == 1) {
            return vetor[0];
        }
        int[] subVetor = new int[vetor.length - 1];
        System.arraycopy(vetor, 1, subVetor, 0, subVetor.length);
        return Math.max(vetor[0], maiorValor(subVetor));
    }
}
