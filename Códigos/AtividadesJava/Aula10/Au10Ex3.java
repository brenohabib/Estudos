package AtividadesJava.Aula10;

public class Au10Ex3 {
    public static void main(String[] args) {

        String[] array = { "Ana", "Breno", "Maria", "Emily", "Isaac" };

        System.out.print("Antes: ");
        printArray(array);

        array = selectionSort(array);
        System.out.print("Depois:");
        printArray(array);

    }

    public static String[] selectionSort(String[] array) {

        String key;
        int i, j;

        for (i = 1; i < array.length; i++) {

            key = array[i];
            j = i - 1;

            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        return array;
    }

    public static void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(" | " + array[i]);

        }
        System.out.println(" | ");
    }
}
