package AtividadesJava.Aula5;

public class TesteMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        }; //Declaração matriz zerada
        int[] valoresEspecificos = new int[3];
        for(int i = 0; i < matriz.length; i++){
            matriz[i][i] = 2;
            valoresEspecificos[i] = matriz[i][i];

        }
    }
}
