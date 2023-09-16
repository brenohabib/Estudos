package AtividadesJava.Aula2;


import java.util.Scanner;

public class Au2Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é palindroma: ");
        String resposta = input.next();
        StringBuilder palindromo = new StringBuilder(resposta).reverse();
        
        if (resposta.equals(palindromo.toString())) {
            System.out.println("Essa palavra é palíndroma");
        } else {
            System.out.println("Essa palavra não é palíndroma");
        }

        input.close();
    }
}
