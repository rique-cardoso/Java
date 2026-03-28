public class CarrinhoDeCompra {
    private EstrategiaPagamento estrategiaAtual;
    public void setEstrategiaPagamento(EstrategiaPagamento estrategia) {
        this.estrategiaAtual = estrategia;
    }
    public void finalizarCompra(double valor){
        if(estrategiaAtual != null){
            estrategiaAtual.pagar(valor);
        } else {
            System.out.println("Nenhuma estratégia de pagamento definida!");
        }
    }
}
