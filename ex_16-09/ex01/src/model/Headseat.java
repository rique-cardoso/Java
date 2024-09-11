package model;

public class Headseat implements IProduto{
    private String nome;
    private String marca;
    private double preco;
    @Override
    public String getNome(){
        return nome;
    }
    @Override
    public String getMarca(){
        return marca;
    }
    @Override
    public double getPreco(){
        return preco;
    }
    public Headseat(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}
