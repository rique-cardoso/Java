package model;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
        this.setTipo("Gato");
    }
    @Override
    public String fazerSom(){
        return this.getNome() + " diz: MIAAUUUUUUU";
    }
}
