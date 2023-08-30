import java.util.Scanner;
public class Au4Ex2 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("\nInsira o %sº valor: ",i + j);
                matriz[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                soma += matriz[i][j];
            }
        }
        System.out.printf("A soma de todos os valores é: %s",soma);
        input.close();
    }
}
