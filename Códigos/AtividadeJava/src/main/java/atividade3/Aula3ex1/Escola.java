package atividade3.Aula3ex1;

public class Escola {
    private String nome;
    private String materia;
    private String turmas;

    public void adicionar_materia(String materia) {
        this.materia += materia;
    }

    public void adicionar_turma(Turma turma) {

    }

    public Materia[] listar_materias() {

        return new Materia[0];
    }

    public Turma[] listar_turmas() {

        return new Turma[0];
    }
}
