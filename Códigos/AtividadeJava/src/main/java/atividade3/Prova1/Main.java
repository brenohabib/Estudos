package atividade3.Prova1;

import atividade2.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        int option = 0;

        Reader clientReader = new Reader("clients_p.csv");
        List<Client> clients = clientReader.readClients();

        Reader locationReader = new Reader("locations.csv");
        List<Location> locations = locationReader.readLocations();
        while(running) {
            Menu mainMenu = new Menu("Leitor CSV");
            mainMenu.text("1 - Ler arquivo \"clients_p.csv\"", 2).left();
            mainMenu.text("2 - Ler arquivo \"locations.csv\"", 3).left();
            mainMenu.text("3 - Sair", 4).left();
            mainMenu.printMenu();
            switch(option) {
                case 1 -> {

                }
                default -> throw new IllegalStateException("Valor inesperado: " + option);
            }
        }
    }
}
