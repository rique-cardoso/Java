public class Strategy02 {
    public static void main(String[] args) {
        CarrinhoDeCompra c1 = new CarrinhoDeCompra();
        c1.setEstrategiaPagamento(new PagamentoPix());
        c1.finalizarCompra(100.0);
        CarrinhoDeCompra c2 = new CarrinhoDeCompra();
        c2.setEstrategiaPagamento(new PagamentoCartao());
        c2.finalizarCompra(250.0);
    }
}