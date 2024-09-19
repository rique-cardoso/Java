package model;

public abstract class Computador {
    private String fabricante;
    private String processador;
    private String memoriaPrincipal;
    private String memoriaSecundaria;
    public Computador(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoriaPrincipal = memoriaPrincipal;
        this.memoriaSecundaria = memoriaSecundaria;
    }
    public void trocarProcessador(String novoProcessador){
        this.setProcessador(novoProcessador);
    }
    public void trocarMemoriaPrincipal(String novaMemoriaPrincipal){
        this.setMemoriaPrincipal(novaMemoriaPrincipal);
    }
    public void trocarMemoriaSecundaria(String novaMemoriaSecundaria){
        this.setMemoriaSecundaria(novaMemoriaSecundaria);
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getMemoriaPrincipal() {
        return memoriaPrincipal;
    }
    public void setMemoriaPrincipal(String memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
    public String getMemoriaSecundaria() {
        return memoriaSecundaria;
    }
    public void setMemoriaSecundaria(String memoriaSecundaria) {
        this.memoriaSecundaria = memoriaSecundaria;
    }
    public abstract void status();
}
