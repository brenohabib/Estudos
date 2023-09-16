package AtividadesJava.Prova1;

public interface P1At1 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[][] matriz = new int [tamanho][tamanho];

        for (int i = 0; i < tamanho; i++){
            matriz[i][0] = 1;
            matriz[i][i] = 1;

        
            for(int j = 1; j < i; j++){
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];

            }
        }
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
