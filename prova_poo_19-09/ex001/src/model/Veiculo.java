package model;

public abstract class Veiculo implements Movimentacao{
    private String modelo;
    private int ano;
    private boolean ligado;
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    @Override
    public void iniciar(){
        if(isLigado()){
            System.out.print("Iniciado o(a) ");
        }else{
            this.setLigado(true);
            System.out.print("Iniciando o(a) ");
        }
    }
    @Override
    public void parar() {
        if(isLigado()){
            this.setLigado(false);
            System.out.print("Parando o(a) ");
        }else{
            System.out.print("Parando o(a) ");
        }
    }
    @Override
    public boolean estaLigado() {
        return this.isLigado();
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
    public abstract void status();
}
