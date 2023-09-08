import java.util.Scanner;
public class P1At2 {
    public static void main(String[] args) {
        char[] vetChar = new char[25];
        Scanner input = new Scanner(System.in);
        int cont = 0;
        String vogais = "aeiouAEIOU";
        for(int i = 0; i < 25; i++){
            vetChar[i] = input.next().charAt(0);
        }
        for(int i = 0; i < 25; i++){
            for(int j = 0; j < vogais.length(); j++){
                System.out.print(vetChar[i] + " ");
                if(vetChar[i] == vogais.charAt(j)){
                    cont++;
                }
            }
        }

        System.out.println("Vogais: " + cont + " Consoantes: " + (vetChar.length - cont));
    }
}
