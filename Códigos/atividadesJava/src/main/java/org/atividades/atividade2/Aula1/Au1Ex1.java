package atividade2.Aula1;

import java.util.Scanner;

public class Au1Ex1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        
        System.out.println("O valor digitado é " + parametro(input.nextInt()));
        input.close();
    }


    public static String parametro(int valor){
        if (valor % 2 == 0) {
            return "Par";
        }
        else {
            return "Impar";
        }
    }
}
