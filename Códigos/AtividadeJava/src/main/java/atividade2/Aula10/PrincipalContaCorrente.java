package atividade2.Aula10;

public class PrincipalContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaTeste = new ContaCorrente("Jorge", 0, (int)Math.random() * 1000);
        contaTeste.depositar(500);
        contaTeste.sacar(20);
        System.out.printf("O valor que %s possui é de R$%.2f",contaTeste.getTitular(), contaTeste.verificarSaldo());
    }
}
