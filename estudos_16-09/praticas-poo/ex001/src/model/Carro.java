package model;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }
    public void ligar(){
        if(this.isLigado()){
            System.out.println("Este carro já está ligado.");
        }else{
            this.setLigado(true);
            System.out.println("Carro ligado");
        }
    }
    public void desligar(){
        if(this.isLigado()){
            this.setLigado(false);
            System.out.println("Carro desligado");
        }else{
            System.out.println("Este carro já está desligado");
        }
    }
    public String info(){
        return "Marca: " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nAno: " + this.getAno()
                + "\nLigado: " + this.isLigado();
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
