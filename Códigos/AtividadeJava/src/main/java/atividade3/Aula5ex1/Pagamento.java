package atividade3.Aula5ex1;

import java.time.LocalDate;

public class Pagamento {
    private int idPagamento;
    private int idAluno;
    private double valor;
    private LocalDate dataPagamento;
    private String status;

    public Pagamento(int idPagamento, int idAluno, double valor, LocalDate dataPagamento, String status) {
        this.idPagamento = idPagamento;
        this.idAluno = idAluno;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.status = status;
    }

    public void registrarPagamento() {

    }
    public void gerarBoleto() {

    }
    public void atualizarStatus() {

    }
    public String getStatus() {
        return this.status;
    }
}
