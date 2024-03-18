package atividade2.Aula9;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("Pedro", 19, 1.74f);
        Pessoa maria = new Pessoa("Maria", 45, 1.56f);

        System.out.println(pedro.getNome() + " tem " + pedro.getIdade() + " anos e " + pedro.getAltura() + " de altura.");
        System.out.println(maria.getNome() + " tem " + maria.getIdade() + " anos e " + maria.getAltura() + " de altura.");
    }
}
