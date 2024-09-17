package model;

public class Seminario extends Avaliacao{
    private String tema;
    private double tempoDuracao;
    public Seminario(String nome, double nota, String tema, double tempoDuracao) {
        super(nome, nota);
        this.tema = tema;
        this.tempoDuracao = tempoDuracao;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public double getTempoDuracao() {
        return tempoDuracao;
    }
    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    @Override
    public String getInfo() {
        return "Seminário: " + getNome() + ", Nota: " + getNota() + 
               ", Tempo de Duração: " + tempoDuracao + 
               "h, Tema: " + tema;
    }
}