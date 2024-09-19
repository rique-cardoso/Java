package model;

public class Moto extends Veiculo{
    private boolean temSidecar;

    public Moto(String modelo, int ano, boolean temSidecar) {
        super(modelo, ano);
        this.temSidecar = temSidecar;
    }

    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }
    public void iniciar(){
        super.iniciar();
        System.out.print("moto.\n");
    }
    public void parar(){
        super.parar();
        System.out.print("moto.\n");
    }
    @Override
    public void status(){
        String respostaEstaLigado = this.isLigado() ? "Sim" : "Não";
        String respostaSidecar = this.isTemSidecar() ? "Sim" : "Não";
        System.out.println("Moto\nModelo: " + this.getModelo() + "\nAno: " + this.getAno() + "\nLigado: " + respostaEstaLigado + "\nTem Sidecar: " + respostaSidecar);
    }
}
