package atividade2.Aula11;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal animal = new Animal();
        boolean running = true;

        System.out.println("Informe a espécie do animal: ");
        animal.setEspecie(input.next());
        System.out.println("Informe o nome do " + animal.getEspecie() + ": ");
        animal.setNome(input.next());

        while (running) {
            System.out.println("Escolha o que deseja ver: ");
            System.out.println("[ 1 ] Nome\n[ 2 ] Espécie");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("O nome do " + animal.getEspecie() + " é " + animal.getNome());
                    break;
            
                case 2:
                    System.out.println("A espécie do " + animal.getNome() + " é " + animal.getEspecie());
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
            System.out.println("Deseja continuar?");
            System.out.println("[ 1 ] Sim\n[ 2 ] Não");
            if (input.nextInt() == 2) {
                break;
            }
        }

        input.close();
    }
}
