import java.util.Scanner;

public class Ex03 {
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
