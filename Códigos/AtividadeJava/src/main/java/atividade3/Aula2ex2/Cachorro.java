package atividade3.Aula2ex2;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, float peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
