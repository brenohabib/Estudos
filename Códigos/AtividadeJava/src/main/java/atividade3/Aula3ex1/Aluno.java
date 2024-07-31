package atividade3.Aula3ex1;

public class Aluno extends Pessoa{
    private String notas;

    public Aluno(String notas) {
        this.notas = notas;
    }

    public void adicionar_nota(String materia, float nota) {

    }

    public float obter_media() {

        return 0;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
