public class FreteGratis implements EstrategiaFrete {
    @Override
    public void calcularFrete(double distancia, double peso){
        System.out.println("Frete Grátis!");
    }
}
