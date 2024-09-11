package model;

public class Livro implements IProduto {
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
    public Livro(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}
