package atividade2.Aula5;

import java.util.Scanner;

public class Au1Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println(somaPar(input.nextInt()));
        input.close();
    }

    public static int somaPar(int valor) {
        if(valor <= 1){
            return 0;
        }

        if(valor % 2 == 0) {
            return valor + somaPar(valor - 2);
        }

        return (valor - 1) + somaPar(valor - 2); 
    }
}
