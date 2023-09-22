package AtividadesJava.Aula10;

public class Au10Ex2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        boolean isDescending = true;

        array = randomArray(array);
        System.out.print("Antes: ");
        printArray(array);

        array = insertionSort(array, isDescending);
        System.out.print("Depois:");
        printArray(array);

    }

    public static int[] insertionSort(int[] array, boolean isDescending) {
        int key, i, j;
        if (isDescending) {
            for (i = 1; i < array.length; i++) {
                key = array[i];
                j = i - 1;

                while (j >= 0 && key > array[j]) {
                    array[j + 1] = array[j];
                    j--;

                }
                array[j + 1] = key;
            }
            return array;

        } else {
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
}
