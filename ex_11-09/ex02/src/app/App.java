package app;
import model.*;
public class App {
    public static void main(String[] args) {
        Pagamento pagamento_dinheiro = new PagamentoEmDinheiro(2900.00, 3000.00);
        NotaFiscal nf_01 = new NotaFiscal(01, "Compra de Notebook", pagamento_dinheiro);
        nf_01.imprimirNota();

        System.out.println("-------------------------------");
        Pagamento pagamento_cartao = new PagamentoEmCartao(3300.00, "Mastercard", 253456);
        NotaFiscal nf_02 = new NotaFiscal(02, "Compra de Notebook", pagamento_cartao);
        nf_02.imprimirNota();
    }
}
