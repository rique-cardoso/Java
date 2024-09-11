package model;

public class PagamentoEmDinheiro extends Pagamento{
    private double valorRecebido;
    private double troco;
    public PagamentoEmDinheiro(double valor, double valorRecebido){
        super(valor);
        this.valorRecebido = valorRecebido;
        this.troco = valorRecebido - valor;
    }
    @Override
    public String imprimir(){
        return "Pagamento em Dinheiro\n" + 
                "Valor Total: R$" + this.getValor() + "\n" +
                "Valor Recebido: R$" + valorRecebido + "\n" + 
                "Troco R$" + troco;
    }
}
