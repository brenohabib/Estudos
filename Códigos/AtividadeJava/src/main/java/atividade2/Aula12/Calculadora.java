package atividade2.Aula12;

class Calculadora {
    public static double dividir(double numerador, double denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Não é possível dividir por zero.");
        }
        return numerador / denominador;
    }
}

class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}