package atividade3.Aula5ex1;

public class Professor extends Pessoa {
    private int idProfessor;
    private String especialidade;

    public Professor(String nome,
                     int idade,
                     String sexo,
                     String endereco,
                     int idProfessor,
                     String especialidade
                     ){
        super(nome, idade, sexo, endereco);
        this.idProfessor = idProfessor;
        this.especialidade = especialidade;
    }

    public void visualizarAlunosEscritos() {

    }
    public void marcarHorarioAtendimento() {

    }
    public void registrarPresenca() {

    }
    public int getIdProfessor() {
        return idProfessor;
    }
}
