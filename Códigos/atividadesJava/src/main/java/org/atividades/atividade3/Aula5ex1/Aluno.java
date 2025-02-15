package atividade3.Aula5ex1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa{

    private int idAluno;
    private String plano;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private final ArrayList<Aula> aulas = new ArrayList<>();
    private int quantidadeAulas;

    public Aluno(String nome,
                 int idade,
                 String sexo,
                 String endereco,
                 int idAluno,
                 String plano,
                 LocalDate data_inicio,
                 LocalDate data_fim
                 ){
        super(nome, idade, sexo, endereco);
        this.idAluno = idAluno;
        this.plano = plano;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public void inscreverEmPlano() {

    }
    public void renovarPlano() {

    }
    public void cancelarPlano() {

    }
    public void visualizarAulas() {

    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }
    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }
    public void addAula(Aula aula) {
        aulas.add(aula);
    }
    public String getAulas() {
        return aulas.toString();
    }
}
