package atividade3.Aula2ex2;

public class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(String nome, float peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
}
