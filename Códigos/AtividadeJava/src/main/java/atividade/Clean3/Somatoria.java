package atividade.Clean3;

public class Somatoria {

    public static void main(String[] args) {
        int soma = 0;

        System.out.println("Somando a e b");
        soma = somar(3, 7);
        System.out.println("resultado da soma de a e b:" + soma);

        System.out.println("Somando x e y");
        soma = somar(1372, 2816);
        System.out.println("resultado da soma de x e y:" + soma);

        System.out.println("Somando w e z");
        soma = somar(271, 865);
        System.out.println("resultado da soma de w e z:" + soma);
    }

    private static int somar(int primeiro, int segundo) {
        return primeiro + segundo;
    }
}
