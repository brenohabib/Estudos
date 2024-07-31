package atividade3.Aula3ex1;

public class Professor extends Pessoa{
    private String materia;

    public Professor(String materia) {
        this.materia = materia;
    }

    public void adicionar_materia(String materia) {
        this.materia = materia;
    }

    public String[] listar_materias() {
        return materia.split(";");
    }
}
