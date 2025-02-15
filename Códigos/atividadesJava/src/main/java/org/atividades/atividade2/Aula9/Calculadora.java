package atividade2.Aula9;

public class Calculadora {
    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public int soma() {
        return valor1 + valor2;
    }
    public int sub() {
        return valor1 - valor2;
    }
    public int mult() {
        return valor1 * valor2;
    }
    public int div() {
        return valor1 / valor2;
    }
}
