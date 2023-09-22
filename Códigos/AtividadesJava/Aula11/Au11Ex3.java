package AtividadesJava.Aula11;

public class Au11Ex3 {
    public static void main(String[] args) {

        int[] array = new int[10];
        array = randomArray(array);

        printArray(array);

        array = randomArray(array);

        array = selectionSort(array);

        printArray(array);
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

}