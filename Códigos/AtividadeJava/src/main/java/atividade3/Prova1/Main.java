package atividade3.Prova1;

import atividade2.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        int option = 1;

        while(running) {
            Menu mainMenu = new Menu("Leitor CSV");
            mainMenu.text("1 - Ler arquivo \"clients_p.csv\"", 2).left();
            mainMenu.text("2 - Ler arquivo \"locations.csv\"", 3).left();
            mainMenu.text("3 - Sair", 4).left();
            mainMenu.printMenu();
            switch(option) {
                case 1 -> {
                    Reader clientReader = new Reader("clients_p.csv");
                    List<Client> clients = clientReader.readClients();

                    mainMenu.text("1 - Buscar por ID", 2).left();
                    mainMenu.printMenu();
                }
                case 2 -> {
                    Reader locationReader = new Reader("locations.csv");
                    List<Location> locations = locationReader.readLocations();

                }
                default -> throw new IllegalStateException("Valor inesperado: " + option);
            }
        }
    }
}
