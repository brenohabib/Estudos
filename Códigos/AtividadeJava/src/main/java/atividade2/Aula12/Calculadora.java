package atividade2.Aula12;

public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double dividir() {
        return getNumero1() / getNumero2();
    }

    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    class DivisaoPorZeroExeption extends Exception {
        public DivisaoPorZeroExeption(String message) {
            super(message);
        }
    }
}
