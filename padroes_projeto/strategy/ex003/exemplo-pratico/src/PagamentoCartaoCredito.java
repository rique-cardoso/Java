public class PagamentoCartaoCredito implements EstrategiaPagamento{
    private String nome;
    private String numeroCartao;

    // Construtor
    public PagamentoCartaoCredito(String nome, String numeroCartao){
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }

    // Implementação do método de Pagamento
    @Override
    public void pagar(double valor){
        // Lógica específica do Cartão
        System.out.println("Pagamento de R$" + valor + " debitado no cartão de " + nome);
    }
}
