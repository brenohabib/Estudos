package AtividadesJava.Aula1;

import java.util.Scanner;
public class Au1Ex2{
    public static void main(String[] args) {
        int[] notas = new int[10];
        Scanner input = new Scanner(System.in);
        int media = 0;
        for(int i = 0; i < notas.length; i++){
            notas[i] = input.nextInt();
            media = media + notas[i];
            
        }
        System.out.println("Media = " + media/10);

        input.close();
    }
}