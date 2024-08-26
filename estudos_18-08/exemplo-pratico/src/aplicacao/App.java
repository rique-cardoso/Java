package aplicacao;

import model.ContaBanco;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco conta1 = new ContaBanco();

        conta1.estadoAtual();
        System.out.println("========================================");
    }
}
