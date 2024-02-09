import java.util.Scanner;
public class AjudaGaby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 51);
        }

        int valorUsuario;
        do {
            System.out.println("Informe um valor inteiro entre 0 e 50: ");
            valorUsuario = scanner.nextInt();

            if (valorUsuario < 0 || valorUsuario > 50) {
                System.out.println("Valor inválido. Informe novamente.");
            }
        } while (valorUsuario < 0 || valorUsuario > 50);

        boolean valorEncontrado = false;
        int posicaoValor = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorUsuario) {
                valorEncontrado = true;
                posicaoValor = i;
                break;
            }
        }
        if (valorEncontrado) {
            System.out.println("O valor " + valorUsuario + " foi encontrado na posição " + posicaoValor);
        } else {
            System.out.println("Valor não encontrado");
        }
    }
}
