package atividade3.Aula2ex2;

public class Main {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex", 19.9F,"Puddle");
        Peixe nemo = new Peixe("Nemo", 0.09F, "Água Salgada");

        System.out.println(rex.getNome() + " é um " + rex.getRaca());
        System.out.println(nemo.getNome() + " vive em " + nemo.getTipoHabitat());
    }
}

