public class Au9Ex3 {
    public static void main(String[] args) {
        


    }
    public static int[] bubbleSort(int[] array){
        
        boolean switched;
        int ammountSwitched = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

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
}

