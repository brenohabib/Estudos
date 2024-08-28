package atividade3.Prova1;

import atividade2.Menu;
import java.util.List;

public class Main {
    static String option = "";

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            mainMenu();
            switch (option) {
                case "1" -> clientMenu();
                case "2" -> locationMenu();
                case "3" -> running = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void mainMenu() {
        Menu mainMenu = new Menu("Leitor CSV");
        mainMenu.text("1 - Ler arquivo \"clients_p.csv\"", 2).left();
        mainMenu.text("2 - Ler arquivo \"locations.csv\"", 3).left();
        mainMenu.text("3 - Sair", 4).left();
        mainMenu.printMenu();
        option = mainMenu.input("Digite uma opção: ");
    }

    private static void clientMenu() {
        Reader clientReader = new Reader("clients_p.csv");
        List<Client> clients = clientReader.readClients();

        if (clients.isEmpty()) {
            System.out.println("Nenhum cliente encontrado.");
            return;
        }

        boolean inClientMenu = true;
        while (inClientMenu) {
            Menu clientMenu = new Menu("Clientes");
            clientMenu.text("1 - Buscar por ID", 2).left();
            clientMenu.text("2 - Buscar por Nome", 3).left();
            clientMenu.text("3 - Voltar", 4).left();
            clientMenu.printMenu();
            option = clientMenu.input("Digite uma opção: ");

            switch (option) {
                case "1" -> searchClientById(clients);
                case "2" -> searchClientByName(clients);
                case "3" -> inClientMenu = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void searchClientById(List<Client> clients) {
        Menu searchMenu = new Menu("Buscar Cliente por ID");
        String idStr = searchMenu.input("Digite o ID do cliente: ");
        try {
            int id = Integer.parseInt(idStr);
            clients.stream()
                    .filter(client -> client.getId() == id)
                    .findFirst()
                    .ifPresentOrElse(
                            Main::printClientInfo,
                            () -> System.out.println("Cliente com ID " + id + " não encontrado.")
                    );
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Tente novamente.");
        }
    }

    private static void searchClientByName(List<Client> clients) {
        Menu searchMenu = new Menu("Buscar Cliente por Nome");
        String name = searchMenu.input("Digite o nome do cliente: ").toLowerCase();
        clients.stream()
                .filter(client -> client.getNome().toLowerCase().contains(name))
                .findFirst()
                .ifPresentOrElse(
                        Main::printClientInfo,
                        () -> System.out.println("Cliente com nome \"" + name + "\" não encontrado.")
                );
    }

    private static void printClientInfo(Client client) {
        Menu infoMenu = new Menu("Cliente " + client.id);
        infoMenu.text("Informações do Cliente",1).center();
        infoMenu.text("ID: " + client.getId(),2).left();
        infoMenu.text("Nome: " + client.getNome(),3).left();
        infoMenu.text("Endereço: " + client.getEndereco(),4).left();
        infoMenu.text("Idade: " + client.getIdade(),5).left();
        infoMenu.text("Preferência de Estadia: " + client.getPreferencia_estadia(),6).left();
        infoMenu.text("ID da localização recomendada: " + getClientRecommendation(client), 7).left();
        infoMenu.printMenu();
        infoMenu.input("Insira qualquer valor para voltar...");
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
            Menu locationMenu = new Menu("Localizações");
            locationMenu.text("1 - Buscar por ID", 2).left();
            locationMenu.text("2 - Buscar por Tipo", 3).left();
            locationMenu.text("3 - Buscar por Referência", 4).left();
            locationMenu.text("4 - Voltar", 5).left();
            locationMenu.printMenu();
            option = locationMenu.input("Digite uma opção: ");

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
            locations.stream()
                    .filter(client -> client.getId() == id)
                    .findFirst()
                    .ifPresentOrElse(
                            Main::printLocationInfo,
                            () -> System.out.println("Localização com ID " + id + " não encontrado.")
                    );
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Tente novamente.");
        }
    }
    private static void searchLocationByType(List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Localização por Tipo");
        String type = searchMenu.input("Digite o tipo do local: ").toLowerCase();
        locations.stream()
                .filter(location -> location.getTipoLocal().toLowerCase().contains(type))
                .forEach(Main :: printLocationInfo);
    }
    private static void searchLocationByReference(List<Location> locations) {
        Menu searchMenu = new Menu("Buscar Localização por Referência");
        String ref = searchMenu.input("Digite a referência do local: ").toLowerCase();
        locations.stream()
                .filter(location -> location.getPontoReferencia().toLowerCase().contains(ref))
                .forEach(Main :: printLocationInfo);
    }
    private static void printLocationInfo(Location location) {
        Menu infoMenu = new Menu("Localização " + location.id);
        infoMenu.setSize(80, 14);
        infoMenu.applyChanges();
        infoMenu.text("Informações da Localização",1).center();
        infoMenu.text("ID: " + location.getId(),2).left();
        infoMenu.text("Nome: " + location.getTipoLocal(),3).left();
        infoMenu.text("Endereço: " + location.getPontoReferencia(),4).left();
        infoMenu.text("Idade: " + location.getQuantidadeQuarto(),5).left();
        infoMenu.text("Preferência de Estadia: " + location.getQuantidadeBanheiro(),6).left();
        infoMenu.text("Bairro: " + location.getBairro(),7).left();
        infoMenu.text("Rua: " + location.getRua(), 8).left();
        infoMenu.text("Quadra: " + location.getQuadra(), 9).left();
        infoMenu.text("Lote: " + location.getLote(), 10).left();
        infoMenu.text("Número: " + location.getNumero(), 11).left();
        infoMenu.text("Quantidade Máxima de Hospedes: " + location.getQuantidadeMaxHospede(), 12).left();
        infoMenu.printMenu();
        infoMenu.input("Insira qualquer valor para continuar...");
    }

    private static int getClientRecommendation(Client client) {



        return 0;
    }
}
