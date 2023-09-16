package AtividadesJava.Aula3;

/**
 1) Crie um programa java que contenha um vetor de 5 posições do tipo String que armazenam
nomes de objetos informados pelo usuário (Utilize o método next()). Após o vetor ser todo
preenchido, mostre na tela a quantidade de letras de cada uma das palavras informadas.
 */
import java.util.Scanner;
public class Au3Ex1 {

    public static void main(String[] args) {
        
        String[] vec = new String[5];
        int[] tamVec = new int[vec.length];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < vec.length; i++){
            vec[i] = input.next();
            tamVec[i] = vec[i].length();
        }

        for(int i = 0; i < vec.length; i++){
            System.out.print(" | "+tamVec[i]);
        }

        System.out.print(" | ");

        input.close();
    }
}