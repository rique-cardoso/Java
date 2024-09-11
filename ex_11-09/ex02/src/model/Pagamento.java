package model;

public abstract class Pagamento {
    private double valor;
    public abstract String imprimir();
    public Pagamento(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
