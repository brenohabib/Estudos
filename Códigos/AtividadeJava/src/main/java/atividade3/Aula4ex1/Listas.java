package atividade3.Aula4ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import atividade3.Aula2ex2.Cachorro;
import atividade3.Aula2ex2.Peixe;

public class Listas {
    public static void main(String[] args) {

        Cachorro[] cachorrosArray = {
                new Cachorro("Mac", 4.7F, "Vira Lata"),
                new Cachorro("Donald", 3.5F, "Puddle"),
                new Cachorro("Lobinho", 20.5F, "Lobo"),
                new Cachorro("Londres", 7.5F, "Rottweiler"),
                new Cachorro("Manjubinha", 8.6F, "Vira Lata")
        };

        Peixe[] peixesArray = {
                new Peixe("Nemo", 0.6F, "Peixe Palhaço"),
                new Peixe("Dory", 0.7F, "Cirurgião-patela"),
                new Peixe("Marlin", 0.8F, "Peixe Palhaço"),
                new Peixe("Bruce", 790.0F, "Tubarão Branco"),
                new Peixe("Gill", 1.0F, "Peixe Cirurgião Moorish Idol")
        };

        List<Cachorro> cachorrosList = new ArrayList<>(Arrays.asList(cachorrosArray));
        List<Peixe> peixesList = new ArrayList<>(Arrays.asList(peixesArray));

        System.out.println("Cachorros:");
        for (Cachorro cachorro : cachorrosList) {
            System.out.println(cachorro.getNome() + " - " + cachorro.getRaca() + " - " + cachorro.getPeso());
        }

        System.out.println("\nPeixes:");
        for (Peixe peixe : peixesList) {
            System.out.println(peixe.getNome() + " - " + peixe.getTipoHabitat() + " - " + peixe.getPeso());
        }
    }
}
