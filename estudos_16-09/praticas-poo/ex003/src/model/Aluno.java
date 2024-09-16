package model;

public class Aluno extends Pessoa{
    private int matricula;
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    @Override
    public String info() {
        return super.info() + "\nMatrícula: " + this.getMatricula();
    }
    public String calcularMediaFinal(double nota1, double nota2, double nota3, double nota4){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return "Média final de " + this.getNome() + ": " + media;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
