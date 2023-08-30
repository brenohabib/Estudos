import java.util.Scanner;
public class Au4Ex3 {
    public static void main(String[] args) {
        int tamanhoX, tamanhoY, maior = 0, menor = 0, indiceXMaior = 0, indiceXMenor = 0, indiceYMaior = 0, indiceYMenor = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor x da matriz: ");
        tamanhoX = input.nextInt();
        System.out.println("Informe o valor y da matriz: ");
        tamanhoY = input.nextInt();
        int[][] matriz = new int[tamanhoX][tamanhoY];
        
        
        for (int i = 0; i < tamanhoX; i++){
            System.out.print("\n|");
            for (int j = 0;j < tamanhoY; j++){
                matriz[i][j] = (int)(Math.random()*100);
                System.out.print(matriz[i][j] + " | ");
                if(i == 0 && j == 0){
                    maior = matriz[i][j];
                }
                if(i == 0 && j == 1){
                    menor = matriz[i][j];
                }
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    indiceXMaior = i;
                    indiceYMaior = j;
                }
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                    indiceXMenor = i;
                    indiceYMenor = j;
                }
            }
        }
        input.close();
        System.out.printf("Número maior: %d no índice %d e %d ",maior,indiceXMaior,indiceYMaior);
        System.out.printf("\n Número menor: %d no índice %d e %d",menor,indiceXMenor,indiceYMenor);
    }
}

