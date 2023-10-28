package atividade.Aula15;

/*1. Crie um algoritmo com os seguintes requisitos
a. Peça para o usuário informar o tamanho do vetor.
b. Popule o vetor de forma dinâmica.
c. Peça para o usuário informar um número para pesquisar no vetor.
d. Crie uma função que ordene o vetor (o método de ordenação fica a sua escolha).
e. Crie 2 funções de busca sendo:
i. Uma função do algoritmo de busca sequencial conforme apresentado na aula
ii. Uma função do algoritmo de sequencial adaptado substituindo o for pelo
while.

f. Compare o tempo de execução dos dois métodos de busca (com for e com while)
g. Compare o tempo de execução dos dois métodos (com for e com while) após ordenar
o vetor.
h. Imprima os resultados. */

import java.util.Scanner;

public class Au15Ex1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max;
        long timer;

        System.out.println("Informe um tamanho para o vetor: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Informe os valores para o vetor:");
        array = createArray(array, input);

        System.out.println("Informe um número para ser buscado: ");
        int number = input.nextInt();

        System.out.println("Tempo de execução usando for: ");
        timer = System.nanoTime();
        linearSearch(array, number);
        System.out.println(System.nanoTime() - timer);

        System.out.println("Tempo de execução usando while: ");
        timer = System.nanoTime();
        linearSearchWhile(array, number);
        System.out.println(System.nanoTime() - timer);
        
        max = maxElement(array);

        array = countingSort(array, max);

        System.out.println("Tempo de execução usando for no vetor ordenado: ");
        timer = System.nanoTime();
        linearSearch(array, number);
        System.out.println(System.nanoTime() - timer);

        System.out.println("Tempo de execução usando while no vetor ordenado: ");
        timer = System.nanoTime();
        linearSearchWhile(array, number);
        System.out.println(System.nanoTime() - timer);

    }
    public static int[] createArray(int[] array, Scanner input) {

        for(int i = 0; i < array.length; i++){
            System.out.print("Indice " + i + ": ");
            array[i] = input.nextInt();
            System.out.println();
        }
        return array;
    }
    public static int[] countingSort(int[] A, int k) {
    
        int[] C = new int[k];

        for (int i = 0; i < A.length; i++) {
            C[A[i] - 1] += 1;
        }
        
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i-1];
        }

        int[] B = new int[A.length];

        for (int i = A.length - 1; i >= 0; i--) {
            B[C[A[i] - 1] -1] = A[i];
            C[A[i] - 1] -= 1;
        }

        return B;
    
    }
    public static int linearSearch(int[] array, int number) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchWhile(int[] array, int number) {
        boolean searching = true;
        int i = 0;
        while (searching && i < array.length) {
            if(array[i] == number) {
                searching = false;
                return number;
            }
        i++;
        }
        return -1;
    }
    public static int maxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.print(" | " + array[i]);
        }
        System.out.println(" | \n");
    }
}
