package model;

public class Aluno extends Pessoa{
    private int matricula;
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do curso");
    }
}
