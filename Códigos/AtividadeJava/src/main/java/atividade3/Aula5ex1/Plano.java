package atividade3.Aula5ex1;

public class Plano {
    private int idPlano;
    private String tipo;
    private double valor;
    private String beneficios;

    public Plano(int idPlano, String tipo, double valor, String beneficios) {
        this.idPlano = idPlano;
        this.tipo = tipo;
        this.valor = valor;
        this.beneficios = beneficios;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
