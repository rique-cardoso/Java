package model;

public class PagamentoEmCartao extends Pagamento{
    private String bandeira;
    private int numeroTransacao;

    public PagamentoEmCartao(double valor, String bandeira, int numeroTransacao){
        super(valor);
        this.bandeira = bandeira;
        this.numeroTransacao = numeroTransacao;
    }
    @Override
    public String imprimir(){
        return "Pagamento em Cartão\n" + 
                "Valor Total: R$" + this.getValor() + "\n" +
                "Bandeira: " + this.bandeira +
                "Número da transação: " + this.numeroTransacao;
    }
}
