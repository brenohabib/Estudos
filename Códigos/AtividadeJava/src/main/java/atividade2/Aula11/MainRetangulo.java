package atividade2.Aula11;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Altura: ");
        retangulo.setAltura(input.nextDouble());
        System.out.println("Informe a Largura: ");
        retangulo.setLargura(input.nextDouble());

        System.out.println("A área calculada do retângulo é: ");
        System.out.println(retangulo.getArea());

        input.close();
    }
}
