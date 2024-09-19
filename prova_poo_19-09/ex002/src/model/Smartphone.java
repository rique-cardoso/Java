package model;

public class Smartphone extends Computador{
    private String tamanhoDeTela;
    private String densidadePixels;
    private String operadora;
    public Smartphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria,
            String tamanhoDeTela, String densidadePixels, String operadora) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.tamanhoDeTela = tamanhoDeTela;
        this.densidadePixels = densidadePixels;
        this.operadora = operadora;
    }
    public void trocarOperadora(String novaOperadora){
        this.setOperadora(novaOperadora);
    }
    public String getTamanhoDeTela() {
        return tamanhoDeTela;
    }
    public void setTamanhoDeTela(String tamanhoDeTela) {
        this.tamanhoDeTela = tamanhoDeTela;
    }
    public String getDensidadePixels() {
        return densidadePixels;
    }
    public void setDensidadePixels(String densidadePixels) {
        this.densidadePixels = densidadePixels;
    }
    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    @Override
    public void status(){
        System.out.println("SMARTPHONE\nFabricante: " + this.getFabricante() + "\nProcessador: " + this.getProcessador() + "\nMemória Principal: " + this.getMemoriaPrincipal() + "\nMemória Secundária: " + this.getMemoriaSecundaria() + "\nTamanho da tela: " + this.getTamanhoDeTela() + "\nDensidade de pixels: " + this.getDensidadePixels() + "\nOperadora: " + this.getOperadora());
    }
}
