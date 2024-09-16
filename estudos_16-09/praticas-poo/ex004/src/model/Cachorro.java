package model;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
        this.setTipo("Animal");
    }
    @Override
    public String fazerSom() {
        return this.getNome() + " diz: AU! AU! AU!";
    }
}
