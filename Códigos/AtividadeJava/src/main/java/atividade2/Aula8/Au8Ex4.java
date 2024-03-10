package atividade2.Aula8;

public class Au8Ex4 {
    public static void main(String[] args) {
        System.out.println(binario(2));
    }
    public static String binario(int numero) {
        if (numero == 0) {
            return "0";
        }
        else {
            int resto = numero % 2;
            int quociente = numero / 2;
            return String.valueOf(resto) + binario(quociente);
        }
    }
}
