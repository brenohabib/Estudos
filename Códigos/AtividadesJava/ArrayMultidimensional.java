package AtividadesJava;

class ArrayMultidimensional {
    
    public static void main(String[] args) {
        
        double[][] larguraAltura = {{2, 3}, {3, 4}};
        double area = larguraAltura[0][0] * larguraAltura[0][1];
        double area2 = larguraAltura[1][0] * larguraAltura[1][1];
        System.out.println(area);
        System.out.println(area2);
    }
    void countSort(int array[], int size) {
        int[] output = new int[size + 1];
    
        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
          if (array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];
    
        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
          count[i] = 0;
        }
    
        // Store the count of each element
        for (int i = 0; i < size; i++) {
          count[array[i]]++;
        }
    
        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
          count[i] += count[i - 1];
        }
    
        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
          output[count[array[i]] - 1] = array[i];
          count[array[i]]--;
        }
    
        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
          array[i] = output[i];
        }
      }
}