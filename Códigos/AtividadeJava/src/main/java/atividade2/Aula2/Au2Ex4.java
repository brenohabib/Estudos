package atividade2.Aula2;

public class Au2Ex4 {
    public static void main(String[] args) {
        System.out.println(calcularPotencia(5, 3));
    }
    public static int calcularPotencia(int base, int expoente) {
        return (int)(Math.pow((double)base, (double)expoente));
    }
}
