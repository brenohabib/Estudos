package atividade2.Aula10;

public class Aluno {
    private String nome;
    private int matricula;
    private float[] notas = new float[3];
    
    public Aluno(String nome, int matricula, float[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public void printNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " = " + calcularNotas(i));
            System.out.println();
        }
    }
    private String calcularNotas(int indice) {
        if(this.notas[indice] >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
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

    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }
}
