package app;

import model.*;

public class App {
    public static void main(String[] args) {
        Fisica p1 = new Fisica("11111111111");
        p1.nome = "Piraporinha";
        Juridica p2 = new Juridica("11111111111111");
        p2.nome = "Piraporão";

        p1.escreverNome();
        p2.escreverNome();
    }
}
