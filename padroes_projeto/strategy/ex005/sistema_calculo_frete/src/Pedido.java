public class Pedido {
    private EstrategiaFrete estrategiaFrete;
    private double distancia;
    private double peso;

    public Pedido(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    // Permite mudar a estratégia em tempo de execução
    public void setEstrategiaFrete(EstrategiaFrete estrategia){
        this.estrategiaFrete = estrategia;
    }

    public void finalizarPedido(){
        if(estrategiaFrete == null){
            throw new RuntimeException("Selecione uma forma de frete!");
        }

        // O pedido delega a tarefa de calcular frete para as estratégias
        estrategiaFrete.calcularFrete(distancia, peso);
    }
}
