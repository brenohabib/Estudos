package atividade2.Aula6;

public class Au6Ex2 {
    public static void main(String[] args) {
        System.out.println(somaFracional(5));
    }
    
    public static double somaFracional(int n) {
        if (n == 1) {
            return 1;
        } 
        else {
            return 1.0 / n + somaFracional(n - 1);
        }
    }
}
