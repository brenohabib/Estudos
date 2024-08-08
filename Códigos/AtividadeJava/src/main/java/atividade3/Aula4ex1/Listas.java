package atividade3.Aula4ex1;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 40d1449a69ee844f013bd68655d9f6eaec6a478f
import java.util.List;

import atividade3.Aula2ex2.Cachorro;
import atividade3.Aula2ex2.Peixe;

public class Listas {
    public static void main(String[] args) {

        Cachorro[] cachorrosArray = {
<<<<<<< HEAD
                new Cachorro("Mac", 4.7F, "Vira Lata"),
                new Cachorro("Donald", 3.5F, "Puddle"),
                new Cachorro("Lobinho", 20.5F, "Lobo"),
                new Cachorro("Londer", 7.5F, "Rotweiler"),
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
=======
            new Cachorro("Mac", 4.7F, "Vira Lata"),
            new Cachorro("Donald", 3.5F, "Puddle"),
            new Cachorro("Lobinho", 20.5F, "Lobo"),
            new Cachorro("Londer", 7.5F, "Rotweiler"),
            new Cachorro("Manjubinha", 8.6F, "Vira Lata")
        };

        Peixe[] peixesArray = {
            new Peixe("Nemo", 0.6F, "Peixe Palhaço"),
            new Peixe("Dory", 0.7F, "Cirurgião-patela"),
            new Peixe("Marlin", 0.8F, "Peixe Palhaço"),
            new Peixe("Bruce", 790.0F, "Tubarão Branco"),
            new Peixe("Gill", 1.0F, "Peixe Cirurgião Moorish Idol")
        };

        List<Cachorro> cachorrosList = new ArrayList<>();
        List<Peixe> peixesList = new ArrayList<>();

        for (Cachorro cachorro : cachorrosArray) {
            cachorrosList.add(cachorro);
        }

        for (Peixe peixe : peixesArray) {
            peixesList.add(peixe);
        }
>>>>>>> 40d1449a69ee844f013bd68655d9f6eaec6a478f

        System.out.println("Cachorros:");
        for (Cachorro cachorro : cachorrosList) {
            System.out.println(cachorro.getNome() + " - " + cachorro.getRaca());
        }

        System.out.println("\nPeixes:");
        for (Peixe peixe : peixesList) {
            System.out.println(peixe.getNome() + " - " + peixe.getTipoHabitat());
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 40d1449a69ee844f013bd68655d9f6eaec6a478f
