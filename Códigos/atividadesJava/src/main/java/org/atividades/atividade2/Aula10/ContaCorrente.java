package atividade2.Aula10;

public class ContaCorrente {
    private String titular;
    private double saldo;
    private int numeroConta;
    
    public ContaCorrente(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public double verificarSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
