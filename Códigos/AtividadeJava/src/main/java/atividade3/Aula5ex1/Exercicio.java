package atividade3.Aula5ex1;

public class Exercicio {
    private int idExercicio;
    private String nome;
    private String grupoMuscular;
    private String descricao;

    public Exercicio(int idExercicio, String nome, String grupoMuscular, String descricao) {
        this.idExercicio = idExercicio;
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.descricao = descricao;
    }

    public int getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(int idExercicio) {
        this.idExercicio = idExercicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
