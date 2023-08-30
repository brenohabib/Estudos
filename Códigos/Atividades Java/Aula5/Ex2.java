/*2. Crie duas matrizes de tamanho 6x6 do tipo inteiro com valores aleatórios entre 0 e 10. Crie um
algoritmo que realize a subtração das duas matrizes e coloque numa terceira matriz, onde o
primeiro elemento da matriz C será a subtração da matriz A com a B, repetindo para todas as
posições. Por exemplo:
matrizC[0][0] = matrizA[0][0] - matrizB[0][0]
matrizC[0][1] = matrizA[0][1] - matrizB[0][1]
matrizC[0][2] = matrizA[0][2] - matrizB[0][2]
...
matrizC[n][n] = matrizA[n][n] - matrizB[n][n] */

public class Ex2 {
    public static void main(String[] args) {
        int[][] matrizA = new int[6][6];
        int[][] matrizB = new int[6][6];
        int[][] matrizC = new int[6][6];

        for(int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA.length; j++){
                matrizA[i][j] = (int)(Math.random()*10);
                matrizB[i][j] = (int)(Math.random()*10);
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.print(" | " + matrizC[i][j]);
            }
        }
    }
}
