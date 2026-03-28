public class PagamentoCartao implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão.");
    }
    
}
