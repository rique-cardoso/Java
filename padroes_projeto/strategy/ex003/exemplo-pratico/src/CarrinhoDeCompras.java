/**
 * Classe Contexto
 * é a classe que precisa realizar a ação (no nosso caso, o carrinho de compras). O truque aqui é que o Carrinho não sabe como os pagamentos funcionam. Ele apenas guarda uma referência para a interface EstrategiaPagamento e chama o método pagar()
 */
public class CarrinhoDeCompras {
    private double totalParaPagar;
    // O Contexto guarda a referência para a Estratégia
    private EstrategiaPagamento estrategiaPagamento;

    // Construtor
    public CarrinhoDeCompras(double total){
        this.totalParaPagar = total;
    }

    // Permite mudar a estratégia em tempo de execução
    public void setEstrategiaDePagamento(EstrategiaPagamento estrategia){
        this.estrategiaPagamento = estrategia;
    }
    public void finalizarCompra(){
        if(estrategiaPagamento == null){
            throw new RuntimeException("Selecione uma forma de pagamento!");
        }
        // O carrinho DELEGA o pagamento para a estratégia selecionada
        estrategiaPagamento.pagar(totalParaPagar);
    }
}
