package atividade3.Prova1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private final String path;

    public Reader(String path) {
        this.path = path;
    }

    public List<Client> readClients() {
        List<Client> clients = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
            List<String[]> lines = csvReader.readAll();
            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i);
                int id = Integer.parseInt(values[0].trim());
                String nome = values[1].trim();
                String endereco = values[2].trim();
                int idade = Integer.parseInt(values[3].trim());
                String preferenciaEstadia = values[4].trim();

                Client client = new Client(id, nome, endereco, idade, preferenciaEstadia);
                clients.add(client);
            }
        } catch (IOException | CsvException | NumberFormatException e) {
            System.err.println("Erro ao ler arquivo de clientes: " + e.getMessage());
        }
        return clients;
    }

    public List<Location> readLocations() {
        List<Location> locations = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
            List<String[]> lines = csvReader.readAll();
            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i);
                int id = Integer.parseInt(values[0].trim());
                String tipoLocal = values[1].trim();
                Location location = getLocation(values, id, tipoLocal);
                locations.add(location);
            }
        } catch (IOException | CsvException | NumberFormatException e) {
            System.err.println("Erro ao ler arquivo de locais: " + e.getMessage());
        }
        return locations;
    }

    private static Location getLocation(String[] values, int id, String tipoLocal) {
        String pontoReferencia = values[2].trim();
        int quantidadeQuarto = Integer.parseInt(values[3].trim());
        int quantidadeBanheiro = Integer.parseInt(values[4].trim());
        String bairro = values[5].trim();
        String rua = values[6].trim();
        int quadra = Integer.parseInt(values[7].trim());
        int lote = Integer.parseInt(values[8].trim());
        int numero = Integer.parseInt(values[9].trim());
        int quantidadeMaxHospede = Integer.parseInt(values[10].trim());
        int quantidadeCama = Integer.parseInt(values[11].trim());
        int quantidadeRecomendacao = Integer.parseInt(values[12].trim());

        Location location = new Location(id, tipoLocal, pontoReferencia, quantidadeQuarto, quantidadeBanheiro,
                bairro, rua, quadra, lote, numero, quantidadeMaxHospede,
                quantidadeCama, quantidadeRecomendacao);
        return location;
    }
}
