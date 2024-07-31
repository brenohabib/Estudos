package atividade3.Aula3ex1;

public class Materia {
    private String nome;
    private String codigo;
    private Professor professor;

    public Materia(String nome, String codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
