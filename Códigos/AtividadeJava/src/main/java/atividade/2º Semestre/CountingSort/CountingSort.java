package atividade.CountingSort;

public class CountingSort {
    
    public static int[] countingSort(int[] array) {
        int min = findMinValue(array);
        int max = findMaxValue(array);

        // Inicializar o array de contagem
        int[] count = new int[max - min + 1];

        // Contar a ocorrência de cada elemento
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        // Calcular as posições finais
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Construir o array ordenado
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int finalPosition = count[array[i] - min] - 1;
            sortedArray[finalPosition] = array[i];
            count[array[i] - min]--;
        }

        return sortedArray;
    }

    // Função auxiliar para encontrar o menor valor no array
    private static int findMinValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Função auxiliar para encontrar o maior valor no array
    private static int findMaxValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        int[] sortedArray = countingSort(array);

        // Imprimir o array ordenado
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
    }
}