public class PagamentoPix implements EstrategiaPagamento{
    private String chavePix;
    
    // Construtor
    public PagamentoPix(String chavePix){
        this.chavePix = chavePix;
    }

    // Implementação do método de pagamento
    @Override
    public void pagar(double valor){
        // Lógica específica do PIX
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso via PIX para a chave " + chavePix);
    }
}
