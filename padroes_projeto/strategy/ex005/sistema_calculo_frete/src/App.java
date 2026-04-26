public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido1 = new Pedido(50.0, 2.1);

        // selecionando tipo de frete
        pedido1.setEstrategiaFrete(new FreteComum());
        pedido1.finalizarPedido();

        Pedido pedido2 = new Pedido(200.0, 10.0);
        pedido2.setEstrategiaFrete(new FreteExpresso());
        pedido2.finalizarPedido();
    }
}
