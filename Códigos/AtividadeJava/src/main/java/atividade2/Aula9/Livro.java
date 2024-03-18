package atividade2.Aula9;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int numeroPaginas;
    
    public Livro(String titulo, String autor, int ano, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numeroPaginas = numeroDePaginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroDePaginas) {
        this.numeroPaginas = numeroDePaginas;
    }
    public void exibirDadosPessoa() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
