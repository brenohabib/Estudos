package atividade2.Aula3;

public class Au3Ex2 {
    public static void main(String[] args) {
        encontrarPrimosIntervalo(1, 100);
    }
    public static void encontrarPrimosIntervalo(int inicio, int fim){
        for(int i = inicio; i <= fim; i++){
            if(verificarPrimo(i)){
                System.out.println(" " + i);
            }
        }
    }
    private static boolean verificarPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
