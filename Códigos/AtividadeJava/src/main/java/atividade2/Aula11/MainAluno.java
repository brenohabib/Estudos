package atividade2.Aula11;

public class MainAluno {
    public static void main(String[] args) {
        Aluno breno, pedro, maria;
        double[][] notas = {{5.7, 7.8, 9.0}, {8.9, 10.0, 5.7}, {10.0, 6.5, 7.8}};

        Aluno[] alunos = {
            breno = new Aluno("Breno Habib", 12345, notas[0]),
            pedro = new Aluno("Pedro Magalhães", 54321, notas[1]),
            maria = new Aluno("Maria Giovanna", 12453, notas[2])
        };

        System.out.println("Médias");
        System.out.println(alunos[0].getNome() + ": " + alunos[0].getMedia());
        System.out.println(alunos[1].getNome() + ": " + alunos[1].getMedia());
        System.out.println(alunos[2].getNome() + ": " + alunos[2].getMedia());

    }
}
