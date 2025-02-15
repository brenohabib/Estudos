package atividade2.Aula11;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;
    
    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    private double calcularMedia() {
        double soma = 0;
        for (double d : notas) {
            soma += d;
        }
        return soma / notas.length;
    }

    public double getMedia() {
        return calcularMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
}
