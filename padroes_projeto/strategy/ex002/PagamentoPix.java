public class PagamentoPix implements EstrategiaPagamento{
    @Override
    public void pagar(double valor){
        System.out.println("Realizado pagamento de R$ " + valor + " via Pix.");
    }
}
