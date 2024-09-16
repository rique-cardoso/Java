package model;
public abstract class Animal {
    private String nome;
    private String tipo;
    public Animal(String nome) {
        this.nome = nome;
    }
    public abstract String fazerSom();
    public String dormir(){
        return "A mimir... zzzzz";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
