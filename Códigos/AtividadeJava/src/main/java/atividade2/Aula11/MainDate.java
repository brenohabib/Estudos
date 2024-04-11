package atividade2.Aula11;

import java.util.Scanner;

public class MainDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a dia, mês e ano: ");
        Data data = new Data(input.nextInt(), input.next(), input.nextInt());
        boolean running = true;

        while (running) {
            System.out.println("Escolha o que pretende ver: \n[ 1 ] Dia \n[ 2 ] Mês \n[ 3 ] Ano");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Dia: " + data.getDia());
                    break;
                case 2:
                    System.out.println("Mês: " + data.getMes());
                    break;
                case 3:
                    System.out.println("Ano: " + data.getAno());
                    break;
                default:
                    System.out.println("Não há esta opção, tente novamente");
                    break;
            }
            System.out.println("Deseja continuar? \n[ 1 ] Sim \n[ 2 ] Não");
            if (input.nextInt() == 2) {
                break;
            }
        }
        input.close();

    }

}
