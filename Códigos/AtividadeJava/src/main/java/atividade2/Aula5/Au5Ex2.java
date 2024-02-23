package atividade2.Aula5;

import java.util.Arrays;

public class Au5Ex2 {
    public static void main(String[] args) {
        int[] array = {1,4,5,2,1};
        System.out.println(somaRecursiva(array));
    }

    public static int somaRecursiva(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        return array[0] + somaRecursiva(Arrays.copyOfRange(array, 1, array.length));
    }
}
