package atividade3.Prova1;

import atividade2.Menu;

public class MenuFactory {
    public static Menu createMainMenu() {
        Menu mainMenu = new Menu("Leitor CSV");
        mainMenu.text("1 - Ler arquivo \"clients_p.csv\"", 2).left();
        mainMenu.text("2 - Ler arquivo \"locations.csv\"", 3).left();
        mainMenu.text("3 - Sair", 4).left();
        return mainMenu;
    }
    public static Menu createClientMenu() {
        Menu clientMenu = new Menu("Clientes");
        clientMenu.text("1 - Buscar por ID", 2).left();
        clientMenu.text("2 - Buscar por Nome", 3).left();
        clientMenu.text("3 - Voltar", 4).left();
        return clientMenu;
    }
    public static Menu createLocationMenu() {
        Menu locationMenu = new Menu("Localizações");
        locationMenu.text("1 - Buscar por ID", 2).left();
        locationMenu.text("2 - Buscar por Tipo", 3).left();
        locationMenu.text("3 - Buscar por Referência", 4).left();
        locationMenu.text("4 - Voltar", 5).left();
        return locationMenu;
    }
    public static void createLocationInfoMenu(Location location) {
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
    public static Menu createClientInfoMenu(Client client, String recommendedLocations) {
        Menu infoMenu = new Menu("Cliente " + client.getId());
        infoMenu.setSize(191, 8);
        infoMenu.text("Informações do Cliente", 1).center();
        infoMenu.text("ID: " + client.getId(), 2).left();
        infoMenu.text("Nome: " + client.getNome(), 3).left();
        infoMenu.text("Endereço: " + client.getEndereco(), 4).left();
        infoMenu.text("Idade: " + client.getIdade(), 5).left();
        infoMenu.text("Sexo: " + client.getSexo(), 6).left();
        infoMenu.text("Preferência de Estadia: " + client.getPreferencia_estadia(), 7).left();
        infoMenu.text("ID(s) da(s) localização(ões) recomendada(s): " + recommendedLocations, 8).left();
        return infoMenu;
    }
}

