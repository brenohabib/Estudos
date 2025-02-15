package atividade.Aula16;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int array[] = {2, 3, 4, 10, 40};

        System.out.print("Digite o elemento a ser procurado: ");
        int toFind = input.nextInt();
        
        int result = binarySearch(array, 0, array.length - 1, toFind);
        if (result == -1) {
            System.out.println("Elemento não encontrado no array");
        }
        else {
            System.out.println("Elemento encontrado no índice " + result);
        }

        input.close();
    }

    public static int binarySearch(int arr[], int start, int end, int toFind) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == toFind)
                return mid;

            if (arr[mid] > toFind)
                return binarySearch(arr, start, mid - 1, toFind);

            return binarySearch(arr, mid + 1, end, toFind);
        }
        
        return -1;
    }
}
