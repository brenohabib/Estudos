package atividade3.Aula5ex1;

public class Aula extends Professor{
    private String tipo;
    private String horario;
    private int capacidadeMaxima;

    public Aula(String nome, int idade, String sexo, String endereco, int idProfessor, String especialidade) {
        super(nome, idade, sexo, endereco, idProfessor, especialidade);
        this.tipo = tipo;
        this.horario = horario;
    }

    public void inscreverAluno(Aluno aluno) {
        aluno.setQuantidadeAulas(aluno.getQuantidadeAulas() + 1);
        aluno.addAula(this);
    }
    public void cancelarInscricao() {

    }
    public void listarInscritos() {

    }
    @Override
    public String toString() {
        return Integer.toString(getIdProfessor());
    }

}
