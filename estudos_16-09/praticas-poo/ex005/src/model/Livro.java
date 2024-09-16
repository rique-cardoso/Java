package model;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private String genero;
    public Livro(String titulo, String autor, int anoDePublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.genero = genero;
    }
    public void exibirInfo(){
        System.out.println("Gênero: " + this.getGenero() + "\nLivro " + this.getTitulo() + ", " + this.getAnoDePublicacao());
        System.out.println("Autor: " + this.getAutor());
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
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
