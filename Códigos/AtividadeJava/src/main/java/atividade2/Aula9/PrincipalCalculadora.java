package atividade2.Aula9;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 2);
        System.out.println("Soma: " + calc.soma());
        System.out.println("Subtração: " + calc.sub());
        System.out.println("Multiplicação: " + calc.mult());
        System.out.println("Divisão: " + calc.div());

    }
}
