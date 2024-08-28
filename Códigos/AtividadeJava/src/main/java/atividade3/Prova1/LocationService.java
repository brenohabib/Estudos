package atividade3.Prova1;

import java.util.List;
import java.util.stream.Collectors;

public class LocationService {
    public Location searchLocationById(List<Location> locations, int id) {
        return locations.stream()
                .filter(location -> location.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public List<Location> searchLocationByType(List<Location> locations, String type) {
        return locations.stream()
                .filter(location -> location.getTipoLocal().toLowerCase().contains(type.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Location> searchLocationByReference(List<Location> locations, String reference) {
        return locations.stream()
                .filter(location -> location.getPontoReferencia().toLowerCase().contains(reference.toLowerCase()))
                .collect(Collectors.toList());
    }
    public void printLocationInfo(Location location) {
        MenuFactory.createLocationInfoMenu(location);
    }
}
