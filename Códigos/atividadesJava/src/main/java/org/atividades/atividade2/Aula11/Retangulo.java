package atividade2.Aula11;

public class Retangulo {
    private double altura = 0;
    private double largura = 0;
    @SuppressWarnings("unused")
    private double area;

    public double getArea() {
        return altura * largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
}
