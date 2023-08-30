/*
 * Em java, crie um programa que contenha um vetor de 10 posições do tipo String. Cada
posição do vetor será informada pelo usuário. Após o vetor preenchido, mostre na tela a
quantidade de vogais que cada uma das palavras.
 */
import java.util.Scanner;
public class Au3Ex2 {
    public static void main(String[] args) {
        String[] vec = new String[10];
        int[] soma = new int[10];
        String vogais = "aeiouAEIOU";
        Scanner input = new Scanner(System.in);
        int cont = 0;

        for(int i = 0; i < vec.length; i++){
            vec[i] = input.next();
            for(int j = 0;j < vec[i].length(); j++){
                char c = vec[i].charAt(j);
                if(vogais.contains(String.valueOf(c))){
                    cont++;
                }
            }

            soma[i] = cont;
            cont = 0;
        }

        for(int i = 0; i< vec.length;i++){
            System.out.println("A palavra "+ vec[i] + " possui " + soma[i] + " vogais");
        }
        
        input.close();
    }
}
