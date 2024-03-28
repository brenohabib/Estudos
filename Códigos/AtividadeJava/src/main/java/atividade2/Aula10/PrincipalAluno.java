package atividade2.Aula10;

public class PrincipalAluno {
    public static void main(String[] args) {
        float[] notas = {6.6f, 7.8f, 10.0f};
        Aluno teste = new Aluno("Gabriel", 12345, notas);
        System.out.printf("Aluno %s | Matrícula: %d\n", teste.getNome(), teste.getMatricula());
        teste.printNotas();
    }
}
