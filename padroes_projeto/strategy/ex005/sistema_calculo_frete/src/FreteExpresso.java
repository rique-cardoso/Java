public class FreteExpresso implements EstrategiaFrete {
    @Override
    public void calcularFrete(double distancia, double peso){
        double valorDistancia = 0.2 * distancia;
        double valorPeso = 0.1 * peso;
        double valorTotal = 7.0 + valorDistancia + valorPeso;
        System.out.println("O valor total do Frete Expresso é de R$" + valorTotal);
    }
}
