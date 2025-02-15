package atividade.Aula14;

public class Au14Ex2 {
    //Escreva uma função recursiva fibonacci(int n) que retorne o n-ésimo número da sequência de Fibonacci.
    public static void main(String[] args) {
        System.out.println(fibonacci(6));

    }

    public static int fibonacci(int n){

        if(n <= 1){
            return n;
        }

        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}