package atividade3.Prova1;

import java.util.List;
import java.util.stream.Collectors;
import atividade2.Menu;

public class ClientService {
    public Client searchClientById(List<Client> clients, int id) {
        return clients.stream()
                .filter(client -> client.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public List<Client> searchClientByName(List<Client> clients, String name) {
        return clients.stream()
                .filter(client -> client.getNome().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
    public String recommendLocations(Client client, List<Location> locations) {
        String preference = client.getPreferencia_estadia().toLowerCase();
        String[] parts = preference.split("[, ]");
        int desiredRooms = 0, desiredBathrooms = 0, desiredBeds = 0;
        String desiredType = "";

        for (int i = 0; i < parts.length; i++) {
            try {
                if (i == 0) {
                    desiredType = parts[i];
                }
                int value = Integer.parseInt(parts[i]);
                switch (parts[i + 1]) {
                    case "quartos" -> desiredRooms = value;
                    case "banheiros" -> desiredBathrooms = value;
                    case "camas" -> desiredBeds = value;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ignored) {
            }
        }
        StringBuilder matchingLocations = new StringBuilder();

        for (Location location : locations) {
            if (location.getTipoLocal().equalsIgnoreCase(desiredType)
                    && location.getQuantidadeQuarto() >= desiredRooms
                    && location.getQuantidadeBanheiro() >= desiredBathrooms
                    && location.getQuantidadeCama() >= desiredBeds) {
                if (!matchingLocations.isEmpty()) {
                    matchingLocations.append(", ");
                }
                matchingLocations.append(location.getId());
            }
        }
        return matchingLocations.isEmpty() ? "Nenhuma localização recomendada encontrada." : matchingLocations.toString();
    }
    public void printClientInfo(Client client, List<Location> locations) {
        Menu infoMenu = MenuFactory.createClientInfoMenu(client, recommendLocations(client, locations));
        infoMenu.printMenu();
        infoMenu.input("Insira qualquer valor para voltar...");
    }
}
