import java.util.Scanner;
import java.util.Random;
public class At1{

    public static void main(String[] args) {
     
        Random random = new Random();
        int[] num = new int[10];
        random.nextInt(10);
        int soma = 0;
        for(int i = 0; i < num.length; i++){
            num[i] = random.nextInt(10);
            soma = soma + num[i];
        }
        System.out.println(soma);
    }

}



