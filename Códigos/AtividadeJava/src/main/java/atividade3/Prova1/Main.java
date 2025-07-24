package atividade3.Prova1;

import atividade2.Menu;
import java.util.List;

import static atividade3.Prova1.MenuController.*;

public class Main {
    static String option = "";
    private static final ClientService clientService = new ClientService();
    private static final LocationService locationService = new LocationService();

    public static void main(String[] args) {
        boolean running = true;
        Reader locationReader = new Reader("locations.csv");
        List<Location> locations = locationReader.readLocations();

        while (running) {
            option = displayMainMenu();
            switch (option) {
                case "1" -> clientMenu(locations);
                case "2" -> locationMenu();
                case "3" -> running = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    private static void clientMenu(List<Location> locations) {
        Reader clientReader = new Reader("clients_p.csv");
        List<Client> clients = clientReader.readClients();

        if (clients.isEmpty()) {
            System.out.println("Nenhum cliente encontrado.");
            return;
        }

        boolean inClientMenu = true;
        while (inClientMenu) {
            option = displayClientMenu();

            switch (option) {
                case "1" -> searchClientById(clients, locations);
                case "2" -> searchClientByName(clients, locations);
                case "3" -> inClientMenu = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void searchClientById(List<Client> clients, List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Cliente por ID");
        String idStr = searchMenu.input("Digite o ID do cliente: ");
        try {
            int id = Integer.parseInt(idStr);
            Client client = clientService.searchClientById(clients, id);
            if (client != null) {
                clientService.printClientInfo(client, locations);
            } else {
                System.out.println("Cliente com ID " + id + " não encontrado.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Tente novamente.");
        }
    }

    private static void searchClientByName(List<Client> clients, List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Cliente por Nome");
        String name = searchMenu.input("Digite o nome do cliente: ").toLowerCase();
        List<Client> foundClients = clientService.searchClientByName(clients, name);
        if (!foundClients.isEmpty()) {
            foundClients.forEach(client -> clientService.printClientInfo(client, locations));
        } else {
            System.out.println("Cliente com nome \"" + name + "\" não encontrado.");
        }
    }

    private static void locationMenu() {
        Reader locationReader = new Reader("locations.csv");
        List<Location> locations = locationReader.readLocations();

        if (locations.isEmpty()) {
            System.out.println("Nenhuma localização encontrada.");
            return;
        }

        boolean inLocationsMenu = true;
        while (inLocationsMenu) {
            option = displayLocationMenu();

            switch (option) {
                case "1" -> searchLocationById(locations);
                case "2" -> searchLocationByType(locations);
                case "3" -> searchLocationByReference(locations);
                case "4" -> inLocationsMenu = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    private static void searchLocationById(List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Localização por ID");
        String idStr = searchMenu.input();

        try {
            int id = Integer.parseInt(idStr);
            Location location = locationService.searchLocationById(locations, id);
            if (location != null) {
                locationService.printLocationInfo(location);
            } else {
                System.out.println("Localização com ID " + id + " não encontrado.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Tente novamente.");
        }
    }

    private static void searchLocationByType(List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Localização por Tipo");
        String type = searchMenu.input("Digite o tipo do local: ").toLowerCase();

        List<Location> filteredLocations = locationService.searchLocationByType(locations, type);
        if (!filteredLocations.isEmpty()) {
            filteredLocations.forEach(locationService::printLocationInfo);
        } else {
            System.out.println("Nenhuma localização encontrada para o tipo: " + type);
        }
    }

    private static void searchLocationByReference(List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Localização por Referência");
        String reference = searchMenu.input("Digite a referência do local: ").toLowerCase();

        List<Location> filteredLocations = locationService.searchLocationByReference(locations, reference);
        if (!filteredLocations.isEmpty()) {
            filteredLocations.forEach(locationService::printLocationInfo);
        } else {
            System.out.println("Nenhuma localização encontrada para a referência: " + reference);
        }
    }
}
