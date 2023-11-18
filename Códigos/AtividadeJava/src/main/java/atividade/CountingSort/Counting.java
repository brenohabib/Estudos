package atividade.CountingSort;

public class Counting {

    public static void main(String[] args) {
        int[] count = {5,2,3,4,0,9,3,2,0};
        count = counting(count, 10);
        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i] + " ");
        }
        
    }

    public static int[] counting (int[] potes, int maiorQuantidade) {

        int[] memoria = new int[maiorQuantidade];
        for(int i = 0; i < potes.length; i++) {
            memoria[potes[i]] += 1;
        }

        for(int i = 1; i < memoria.length; i++) {
            memoria[i] += memoria[i - 1];
        }

        int[] cookies = new int[potes.length];  
        for(int i = potes.length - 1; i >= 0; i--) {
            cookies[memoria[potes[i]] - 1] = potes[i];
            memoria[potes[i]] -= 1;
        }

        return cookies;
    }
}
