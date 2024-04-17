package atividade2.Aula12;

import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma temperatura em °C: ");
        double celcius = input.nextDouble();
        try {
            System.out.println("Temperatura em °F: " +
                ConversorDeTemperatura.converterCelsiusParaFahrenheit(celcius)
            );
        } catch (TemperaturaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }



        input.close();
    }
}
