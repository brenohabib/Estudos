package AtividadesJava.Prova1;

import java.util.Scanner;
public class P1At3 {
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da matriz entre 1 e 10: ");
        Scanner input = new Scanner(System.in);
        int tamanho = input.nextInt();
        int[] vetor = new int[100];
        int[][] matriz = new int[tamanho][tamanho];
        int cont = 0;
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()* 101);
            System.out.print(vetor[i] + " ");

        }
        for(int i = 0; i < tamanho; i++){
            for(int  j = 0; j < tamanho; j++){
                matriz[i][j] = vetor[cont];
                cont++;
                
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < tamanho; i++){
            for(int  j = 0; j < tamanho; j++){
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
        input.close();
    }
}
