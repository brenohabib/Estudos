package atividade3.Aula2ex1;

public class Filme {
    private String titulo;
    private int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras() {
        int horas;
        int minutos;

        horas = duracaoEmMinutos / 60;
        minutos = duracaoEmMinutos % 60;

        System.out.println("O filme " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
