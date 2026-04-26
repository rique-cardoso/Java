public class FreteComum implements EstrategiaFrete{

    // Implementação do método de Calcular Frete
    @Override
    public void calcularFrete(double distancia, double peso){
        double valorDistancia = 0.2 * distancia;
        double valorPeso = 0.1 * peso;
        double valorTotal = valorDistancia + valorPeso;
        System.out.println("Valor total do Frete Comum é R$"+ valorTotal);
    }
}
