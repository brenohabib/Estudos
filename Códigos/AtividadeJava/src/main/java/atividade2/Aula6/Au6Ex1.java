package atividade2.Aula6;

public class Au6Ex1 {
    public static void main(String[] args) {
        int[] array = {0,2,10,3,2};
        System.out.println(maiorValor(array));
    }
    public static int maiorValor(int[] array) {
        int maior = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}
