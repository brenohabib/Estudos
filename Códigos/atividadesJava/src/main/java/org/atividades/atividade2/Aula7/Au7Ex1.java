package atividade2.Aula7;

public class Au7Ex1 {
    public static void main(String[] args) {
    int n = 22222222;
    int k = 2;
    int qtd = contarDigito(n, k);
    System.out.println("quantidade: " + qtd);
    }
    public static int contarDigito(int n, int k) {
        if (n == 0) {
            return 0;
        } else {
            int ultimoDigito = n % 10;
            int resto = n / 10;
            int verificarDigito = contarDigito(resto, k);
            if (ultimoDigito == k) {
                return 1 + verificarDigito;
            }
            else {
                return verificarDigito;
            }
        }
    }
}
