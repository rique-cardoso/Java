package model;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String modelo, int ano, int numeroDePortas) {
        super(modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    @Override
    public void iniciar(){
        super.iniciar();
        System.out.print("carro.\n");
    }
    @Override
    public void parar(){
        super.parar();
        System.out.print("carro.\n");
    }
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    @Override
    public void status(){
        String respostaEstaLigado = this.isLigado()?"Sim" : "Não";
        System.out.println("Carro\nModelo: " + this.getModelo() + "\nAno: " + this.getAno() + "\nLigado: " + respostaEstaLigado + "\nNúmero de Portas: " + this.getNumeroDePortas());
    }
}
