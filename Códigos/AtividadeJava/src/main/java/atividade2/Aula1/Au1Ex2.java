package atividade2.Aula1;

public class Au1Ex2 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int valor) {
        int fatorial = valor;
        for (int i = 0; i <= valor; i++) {
            valor--;
            fatorial *= valor;
        }
        return fatorial;
    }

}
