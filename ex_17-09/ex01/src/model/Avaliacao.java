package model;

public abstract class Avaliacao {
    private String nome;
    private double nota;
    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        try {
            if(nota <= 0){
                throw new IllegalArgumentException("ERRO: não é permitido uma nota menor ou igual a zero.\nSerá atribuído uma nota 10.0");
            }
            this.nota = nota;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.nota = 10.0;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public abstract String getInfo();
}