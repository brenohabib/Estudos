package atividade3.Prova1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader clientReader = new Reader("clients_p.csv");
        List<Client> clients = clientReader.readClients();

        for (Client client : clients) {
            System.out.println("Client ID: " + client.getId());
            System.out.println("Name: " + client.getNome());
            System.out.println("Address: " + client.getEndereco());
            System.out.println("Age: " + client.getIdade());
            System.out.println("Preferred Stay: " + client.getPreferencia_estadia());
            System.out.println();
        }

        Reader locationReader = new Reader("locations.csv");
        List<Location> locations = locationReader.readLocations();

        for (Location location : locations) {
            System.out.println("Location ID: " + location.getId());
            System.out.println("Type: " + location.getTipoLocal());
            System.out.println("Reference Point: " + location.getPontoReferencia());
            System.out.println("Number of Rooms: " + location.getQuantidadeQuarto());
            System.out.println();
        }
    }
}
