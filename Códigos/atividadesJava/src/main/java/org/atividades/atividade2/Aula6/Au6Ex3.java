package atividade2.Aula6;

public class Au6Ex3 {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3, 4, 5, 9, 9},
            {6, 7, 8, 9, 10, 20, 20},
            {11, 12, 13, 14, 15, 30, 30},
            {16, 17, 18, 19, 20, 24, 25},
            {21, 22, 23, 24, 25, 8, 9},
            {16, 17, 18, 19, 20, 24, 25},
            {21, 22, 23, 24, 25, 8, 9}
        };

        int[][] matrizB = {
            {1, 2, 3},
            {6, 7, 8},
            {11, 12, 13}
            
        };

        int[][] matrizC = {
            {1, 2, 3, 4, 8},
            {6, 7, 8, 9, 18},
            {11, 12, 13, 10, 23},
            {14, 15, 16, 20, 25},
            {1, 2, 3, 4, 8}
            
        };
        System.out.println("Valores matriz D:");
        int[] quadrado = exibirMatrizD(matrizA);
        for (int valor : quadrado) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Valores matriz E:");
        quadrado = exibirMatrizE(matrizB);
        for (int valor : quadrado) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Valores matriz B:");
        quadrado = exibirMatrizB(matrizC);
        for (int i = 0; i < quadrado.length; i++) {
            System.out.print(quadrado[i] + " ");
        }
    }   
    public static int[] exibirMatrizD(int[][] matriz) {
        int[] vetor = new int[matriz.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = matriz[i][i];
        }

        return vetor;
    }
    public static int[] exibirMatrizE(int[][] matriz) {
        int[] vetor = new int[matriz.length];
        int aux = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = matriz[i][aux];
            aux--;
        }

        return vetor;
    }
    public static int[] exibirMatrizB(int[][] matriz) {
        int x = matriz.length / 2;
        int y = matriz.length / 2;
        int aux = 0;
        int auy = 0;
        int[][] subMatriz = new int[x + 1][y + 1];
        int[] vetor = new int[x * x];

        for (int i = x + 1; i < matriz.length; i++) {
            for (int j = y + 1; j < matriz.length; j++) {
                subMatriz[aux][auy] = matriz[i][j];
                auy++;
            }
            aux++;
            auy = 0;
        }
        aux = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                vetor[aux] = subMatriz[i][j];
                aux++;
            }
        }
        return vetor;
    }
    
}
