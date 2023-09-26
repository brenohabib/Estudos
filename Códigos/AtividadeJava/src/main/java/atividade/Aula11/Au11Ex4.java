package atividade.Aula11;

public class Au11Ex4 {

    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];

        long insertionNanoTime, bubbleNanoTime, selectionNanoTime, beginning;

        arrayB = randomArray(arrayB);
        printArray(arrayB);

        arrayA = copyArray(arrayB);

        beginning = System.nanoTime();
        bubbleSort(arrayA);
        bubbleNanoTime = System.nanoTime() - beginning;
        printArray(arrayA);

        beginning = System.nanoTime();
        insertionSort(arrayB);
        insertionNanoTime = System.nanoTime() - beginning;

        beginning = System.nanoTime();
        selectionSort(arrayC);
        selectionNanoTime = System.nanoTime() - beginning;

        System.out.println("Tempo do inserion: " + insertionNanoTime);
        System.out.println("Tempo do bubble: " + bubbleNanoTime);
        System.out.println("Tempo do selection: " + selectionNanoTime);

    }

    public static int[] insertionSort(int[] array) {
        int key, i, j;

        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = key;
        }
        return array;
    }
    
    public static int[] selectionSort(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            int key = i;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[key]) {

                    key = j;

                }

            }
            int temp = array[i];
            array[i] = array[key];
            array[key] = temp;

        }
        return array;

    }

    public static int[] randomArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 11);

        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(" | " + array[i]);

        }
        System.out.println(" | ");
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static long compareTime(long first, long second) {

        long diference = first - second;

        return diference;
    }

    public static int[] copyArray(int[] array) {
        int[] replica = new int[array.length];
        System.arraycopy(array, 0, replica, 0, array.length);
        return replica;
    }
}
