package atividade.Aula5;

/*3. Crie um programa que receba uma matriz de tamanho 3x3 de tipo inteiro e preencha com
valores aleatórios. Crie um algoritmo que retorne a matriz transposta, ou seja, troque as linhas
pelas colunas. */
public class Au5Ex3 {
    public static void main(String[] args) {
        
        int tamanhoX = 3, tamanhoY = 3;

        int[][] matriz = new int[tamanhoX][tamanhoY];
        int[][] matrizTransposta = new int[tamanhoY][tamanhoX];


        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){

                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(" | " + matriz[i][j]);

                if(j == matriz.length - 1){
                    System.out.println(" | ");

                }
            }
        }

        System.out.println();
        for (int i = 0; i < matrizTransposta.length; i++){
            for (int j = 0; j < matrizTransposta.length; j++){
                matrizTransposta[j][i] = matriz[i][j];
                
            }
        }
        for (int i = 0; i < matrizTransposta.length; i++){
            for (int j = 0; j < matrizTransposta.length; j++){

                System.out.print(" | " + matrizTransposta[i][j]);
                if(j == matriz.length - 1){

                    System.out.println(" | ");
                    
                }
            }
        }
    }
}
