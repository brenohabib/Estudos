package atividade2.Aula2;

public class Au2Ex3 {
    public static void main(String[] args) {
        
        System.out.println(fibonacci(3));

    }
    public static int fibonacci(int num) {

        int[] array = new int[num + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[num - 1];
    }
}
