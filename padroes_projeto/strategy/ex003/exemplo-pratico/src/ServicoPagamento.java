/*
    Classe apenas para exemplo de como seria se o padrão não estivesse implementado.
 */

public class ServicoPagamento {
    public void processarPagament(String metodo, double valor){
        if(metodo.equals("PIX")){
            // 20 linhas de código complexo para gerar chave PIX e validar
            System.out.println("Pagando " + valor + " via PIX.");
        }else if(metodo.equals("CARTAO")){
            // 30 linhas de código para conectar com a operadora do cartão
            System.out.println("Pagando " + valor + " via Cartão de Crédito");
        }else if(metodo.equals("PAYPAL")){
            // Mais um monte de código de integração...
            System.out.println("Pagando " + valor + " via PayPal.");
        }
    }
}


/***
 * Viola o Princípio da Responsabilidade Única: A classe ServicoPagamento sabe fazr coisas demais.
 * Viola o Principio Aberto/Fechado (Open/Closed): Se o marketing decidir adicionar pagamento via "Boleto", você terá que abrir essa classe, adicionar mais um else if e o risco de quebrar os outros pagamentos é grande.
 * O código fica gigante e difícil de testar.
 */