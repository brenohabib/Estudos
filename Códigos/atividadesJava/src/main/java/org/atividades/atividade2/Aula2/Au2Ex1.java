package atividade2.Aula2;

public class Au2Ex1 {
    public static void main(String[] args) {
        parimpar(4);
    }

    public static void parimpar(int num) {
        if(num < 0) {
            System.out.println("O numero deve ser positivo");
        }
        else {
            if (num % 2 == 0) {
                System.out.println("O número é par!");
            }
            else {
                System.out.println("O numero é impar!");
            }
        }
    }
}
