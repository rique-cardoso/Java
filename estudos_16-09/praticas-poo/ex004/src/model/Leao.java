package model;

public class Leao extends Animal{
    public Leao(String nome) {
        super(nome);
        this.setTipo("Leão");
    }
    @Override
    public String fazerSom(){
        return this.getNome() + " diz: RUGIDÃOOOO!";
    }
}
