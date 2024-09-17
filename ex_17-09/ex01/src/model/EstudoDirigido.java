package model;

public class EstudoDirigido extends Avaliacao{
    private String tema;
    private int numeroDePaginas;
    public EstudoDirigido(String nome, double nota, String tema, int numeroDePaginas) {
        super(nome, nota);
        this.tema = tema;
        this.numeroDePaginas = numeroDePaginas;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    @Override
    public String getInfo() {
        return "Estudo Dirigido: " + getNome() + ", Nota: " + getNota() + 
               ", Número de Páginas: " + numeroDePaginas +
               ", Tema: " + tema;
    }
}