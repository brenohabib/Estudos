package atividade2.Aula3;

public class Au3Ex6 {
    public static void main(String[] args) {
        
    }
    public static void imprimirMatriz(int[][] matriz) {
        System.out.print("|");
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
