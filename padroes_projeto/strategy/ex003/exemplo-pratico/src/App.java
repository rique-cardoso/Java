public class App {
    public static void main(String[] args) throws Exception {
        // O cliente montou um carrinho com R$ 150.00
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(150.00);
        
        // Cliente escolheu pagar com Cartão
        carrinho.setEstrategiaDePagamento(new PagamentoCartaoCredito("Bob Bound", "1234.5678.910-11"));
        carrinho.finalizarCompra();
        // Saída: Pagamento de R$150.00 debitado no cartão de Maria Silva

        System.out.println("--- Nova Compra ---");

        // Outro cliente montou um carrinho com R$ 50.00
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras(50.00);

        // Este cliente escolheu pagar com PIX
        carrinho2.setEstrategiaDePagamento(new PagamentoPix("cart.carter@mail.com"));
        carrinho2.finalizarCompra();
        // Saída: Pagamento de R$50.0 realizado com sucesso via Pix para a chave cart.carter@mail.com
    }
}
