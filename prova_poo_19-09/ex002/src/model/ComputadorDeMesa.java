package model;

public class ComputadorDeMesa extends Computador{
    private String fabricanteGabinete;
    private String tipoGabinete;
    private String fonte;
    public ComputadorDeMesa(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria,
            String fabricanteGabinete, String tipoGabinete, String fonte) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.fabricanteGabinete = fabricanteGabinete;
        this.tipoGabinete = tipoGabinete;
        this.fonte = fonte;
    }
    public void trocarFabricanteGagbinete(String novoFabricanteGabinete){
        this.setFabricanteGabinete(novoFabricanteGabinete);
    }
    public void trocarTipoGabinete(String novoTipoGabinete){
        this.setTipoGabinete(novoTipoGabinete);
    }
    public void trocarFonte(String novaFonte){
        this.setFonte(novaFonte);
    }
    public String getFabricanteGabinete() {
        return fabricanteGabinete;
    }
    public void setFabricanteGabinete(String fabricanteGabinete) {
        this.fabricanteGabinete = fabricanteGabinete;
    }
    public String getTipoGabinete() {
        return tipoGabinete;
    }
    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }
    public String getFonte() {
        return fonte;
    }
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
    @Override
    public void status(){
        System.out.println("COMPUTADOR\nFabricante: " + this.getFabricante() + "\nProcessador: " + this.getProcessador() + "\nMemória Principal: " + this.getMemoriaPrincipal() + "\nMemória Secundária: " + this.getMemoriaSecundaria() + "\nFabricante do Gabinete: " + this.getFabricanteGabinete() + "Fonte: " + this.getFonte());
    }
}
