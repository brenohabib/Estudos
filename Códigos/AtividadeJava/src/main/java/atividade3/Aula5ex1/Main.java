package atividade3.Aula5ex1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate initDate = LocalDate.of(2022, 1, 1);
        LocalDate finalDate = LocalDate.of(9999, 11, 29);
        LocalDate dataPagamento = LocalDate.of(2022, 1, 5);

        Aluno breno = new Aluno(
                "Breno Habib Dhaher Muhammad Oliveira",
                19,
                "Sem experiencia",
                "Nilson Veloso 1",
                0,
                "Vitalicio",
                initDate,
                finalDate
        );
        Aula aulaDoGustavo = new Aula(
                "Gustavo",
                40,
                "Feminino",
                "Pauzanes",
                0,
                "Dar aula"
        );
        Aula aulaDoGustavo2 = new Aula(
                "William",
                16,
                "MACHO",
                "UniRV",
                1,
                "Dar cambalhotas"
        );
        Pagamento pagamento = new Pagamento(
                0,
                0,
                567.99,
                dataPagamento,
                "Vencido"
        );
        aulaDoGustavo.inscreverAluno(breno);
        aulaDoGustavo2.inscreverAluno(breno);
        System.out.printf("Quantidade aulas: %d\n", breno.getQuantidadeAulas());
        System.out.printf("Status Pagamento: %s\n", pagamento.getStatus());
        System.out.printf("ID professor: %d", aulaDoGustavo.getIdProfessor());
    }
}
