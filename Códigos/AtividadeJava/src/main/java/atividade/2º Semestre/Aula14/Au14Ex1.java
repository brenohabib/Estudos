package atividade.Aula14;

public class Au14Ex1 {
    //Escreva uma função recursiva somaArray(int[] arr, int n) que retorne a soma dos primeiros n elementos do array arr.
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};//soma até 1,2,...,10,11 = 66

        System.out.println(arraySum(arr, 10));

    }
    public static int arraySum(int[] array, int n){

        if(n == 0){
            return array[0];
        }
        else{
            return array[n] + arraySum(array, n-1);
        }
    }
}
