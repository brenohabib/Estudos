package AtividadesJava.Aula9;

public class Au9Ex3 {
    public static void main(String[] args) {
        
        int[] arrayA = new int[10];
        arrayA = randomArray(arrayA);
        int[] arrayB = new int[10];
        for(int i = 0; i < arrayA.length; i++){
            arrayB[i] = arrayA[i];
        }
        System.out.println("Random array: ");
        printArray(arrayA);

        bubbleSort(arrayA);
        System.out.println("Sorted array: ");
        printArray(arrayA);
        
        optimizedBubbleSort(arrayB);
        System.out.println("Sorted array: ");
        printArray(arrayB);
        
    }
    
    public static int[] optimizedBubbleSort(int[] array){

        printLine(21);
        System.out.println("Optimized Bubble Sort");
        printLine(21);

        int amountSwitched = 0;
        int comparisons = 0;
        for(int i = 0; i < array.length; i++){
            boolean switched = false;
            for(int j = 0; j < array.length - 1; j++){
                comparisons++;
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    switched = true;
                    amountSwitched++;
                }
            }
            if(switched == false){
                break;
            }
        }
        System.out.println(" Switches: " + amountSwitched + "\n");
        System.out.println(" Comparisons: " + comparisons + "\n");
        return array;
    }

    public static int[] bubbleSort(int[] array){

        printLine(25);
        System.out.println("Non Optimized Bubble Sort");
        printLine(25);

        int amountSwitched = 0;
        int comparisons = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                comparisons++;
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    amountSwitched++;
                }
            }
        }
        System.out.println(" Switches: " + amountSwitched + "\n");
        System.out.println(" Comparisons: " + comparisons + "\n");
    return array;
    }

    public static int[] randomArray(int[] array){

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*11);
        }

        return array;
    }
    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.print(" | " + array[i]);
        }
        System.out.println(" | \n");
    }
    public static void printLine(int size){
        for(int i = 0; i < size; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}

