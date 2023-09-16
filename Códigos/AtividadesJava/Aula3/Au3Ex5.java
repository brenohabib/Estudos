package AtividadesJava.Aula3;

/*
 * Crie em java um programa com um vetor de 15 posições do tipo String. O usuário deverá
preencher este vetor com nomes aleatórios. Após isso, verifique quantas vezes cada palavra se
repete dentro desse vetor.
Exemplo: [“gato”, “arara”, “ovo”, “gato”, “macarrao”]
gato se repete 2 vez(es)
arara se repete 1 vez(es)
ovo se repete 1 vez(es)
macarrao se repete 1 vez(es)
 */
import java.util.Scanner;
public class Au3Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vetor = new String[15];
        int[] contagens = new int[vetor.length];

        System.out.println("Preencha o vetor com 15 nomes aleatórios:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            vetor[i] = input.nextLine();
        }

        for (int i = 0; i < 15; i++) {
            int contador = 1;
            for (int j = i + 1; j < 15; j++) {
                if (vetor[i].equals(vetor[j])) {
                    contador++;
                    vetor[j] = "";
                }
            }
            if (!vetor[i].isEmpty()) {
                contagens[i] = contador;
            }
        }

        System.out.println("\nResultado da contagem:");
        for (int i = 0; i < 15; i++) {
            if (contagens[i] > 0) {
                System.out.println(vetor[i] + " se repete " + contagens[i] + " vez(es)");
            }
        }
        input.close();
    }
}