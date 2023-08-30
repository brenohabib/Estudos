public class Au4Ex1 {
    public static void main(String[] args) {
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++){
            System.out.print("\n|");
            for (int j = 0;j < tamanho; j++){
                matriz[i][j] = (int)(Math.random()*100);
                System.out.print(matriz[i][j] + " | ");
                
            }
        }
    }
}
