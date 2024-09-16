package model;

public class Vaca extends Animal{
    public Vaca(String nome) {
        super(nome);
        this.setTipo("Vaca");
    }
    @Override
    public String fazerSom(){
        return this.getNome() + " diz: MUUUUU MUUUUUUUU";
    }
}
